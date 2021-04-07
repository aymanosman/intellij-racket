package org.racket.ide.codeInspection

import com.intellij.codeInspection.*
import com.intellij.execution.ExecutionException
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.CapturingProcessAdapter
import com.intellij.execution.process.OSProcessHandler
import com.intellij.execution.process.ProcessEvent
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Ref
import com.intellij.psi.PsiFile
import org.racket.ide.highlight.DeleteUnusedRequireFix
import org.racket.ide.settings.OpenRacketSettings
import org.racket.ide.settings.RacketSettings
import java.io.File

class UnusedRequiresInspection : GlobalSimpleInspectionTool() {
    private val LOG = Logger.getInstance(UnusedRequiresInspection::class.toString())

    private val TIMEOUT_IN_MILLISECONDS = 3000

    data class Problem(val modulePath: String, val offset: Int)

    override fun checkFile(file: PsiFile,
                           manager: InspectionManager,
                           holder: ProblemsHolder,
                           globalContext: GlobalInspectionContext,
                           problemDescriptionsProcessor: ProblemDescriptionsProcessor) {

        val problems = getProblems(file)

        problems?.forEach { problem ->
            val element = file.findElementAt(problem.offset)

            if (element != null) {
                holder.registerProblem(element,
                        "Unused require <code>#ref</code> #loc",
                        DeleteUnusedRequireFix())
            }
        }
    }


    private fun getProblems(file: PsiFile): Collection<Problem>? {
        val racketPath = getRacketPath(file.project) ?: return null

        return try {
            val commandLine: GeneralCommandLine = GeneralCommandLine()
                    .withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE)
                    .withWorkDirectory(file.virtualFile.parent.path)
                    .withExePath(racketPath)
                    .withParameters(listOf("-lm", "intellij/unused-requires", file.virtualFile.name))
            val handler = OSProcessHandler(commandLine)
            val response: Ref<Collection<Problem>> = Ref.create()
            handler.addProcessListener(object : CapturingProcessAdapter() {
                override fun processTerminated(event: ProcessEvent) {
                    if (event.exitCode == 0) {
                        response.set(output.stdoutLines.map { line ->
                            val parsed = line.split(" ")
                            Problem(parsed[0], parsed[1].toInt())
                        })
                    } else {
                        checkRacketIntellijPackageInstalled(racketPath)
                    }
                }
            })
            handler.startNotify()

            if (!handler.waitFor(TIMEOUT_IN_MILLISECONDS.toLong())) {
                handler.destroyProcess()
            }
            response.get()
        } catch (e: ExecutionException) {
            LOG.error(e)
            null
        }
    }

    private fun checkRacketIntellijPackageInstalled(racketPath: String) {
        val commandLine = GeneralCommandLine().withExePath(racketPath).withParameters("-e", """(collection-file-path "dummy.rkt" "intellij)""")
        val handler = OSProcessHandler(commandLine)
        handler.addProcessListener(object : CapturingProcessAdapter() {
            override fun processTerminated(event: ProcessEvent) {
                if (event.exitCode != 0) {
                    Notifications.Bus.notify(NOTIFICATION_GROUP.createNotification(NOTIFICATION_GROUP_ID, "<p>Finding unused requires failed</p><p>Make sure you have run <code>raco pkg install intellij</code></p>", NotificationType.ERROR))
                }
            }
        })
        handler.startNotify()
        if (!handler.waitFor(2000)) {
            handler.destroyProcess()
        }
    }

    private fun getRacketPath(project: Project): String? {
        val settings = RacketSettings.getInstance()
        val path = settings.racketPath
        val file = File(path)

        return if (file.canExecute()) {
            path
        } else {
            val notification = NOTIFICATION_GROUP.createNotification(NOTIFICATION_GROUP_ID, "Invalid Racket executable path \"${path}\"", NotificationType.ERROR)
                    .addAction(OpenRacketSettings())
            Notifications.Bus.notify(notification, project)

            null
        }
    }

    override fun worksInBatchModeOnly(): Boolean {
        return false
    }

    companion object {
        const val NOTIFICATION_GROUP_ID = "Racket inspection issues"
        val NOTIFICATION_GROUP = NotificationGroup.balloonGroup(NOTIFICATION_GROUP_ID)
    }
}
