package org.racket.ide

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.CapturingProcessAdapter
import com.intellij.execution.process.OSProcessHandler
import com.intellij.execution.process.ProcessEvent
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.project.Project
import org.racket.ide.settings.OpenRacketSettings
import org.racket.ide.settings.RacketSettings
import java.io.File

class RacketSdkUtil {
    companion object {
        const val NOTIFICATION_GROUP_ID = "Racket inspection issues"
        val NOTIFICATION_GROUP = NotificationGroup.balloonGroup(NOTIFICATION_GROUP_ID)


        fun getRacketPath(project: Project): String? {
            val settings = RacketSettings.getInstance()
            val path = settings.racketPath
            val file = File(path)

            return if (file.canExecute()) {
                path
            } else {
                val notification =
                        NOTIFICATION_GROUP
                                .createNotification(
                                        NOTIFICATION_GROUP_ID,
                                        "Invalid Racket executable path \"${path}\"",
                                        NotificationType.ERROR)
                                .addAction(OpenRacketSettings())
                Notifications.Bus.notify(notification, project)

                null
            }
        }

        fun checkRacketIntellijPackageInstalled() {
            val commandLine = GeneralCommandLine()
                    .withExePath(RacketSettings.getInstance().racketPath)
                    .withParameters("-e", """(collection-file-path "dummy.rkt" "intellij)""")
            val handler = OSProcessHandler(commandLine)
            handler.addProcessListener(object : CapturingProcessAdapter() {
                override fun processTerminated(event: ProcessEvent) {
                    if (event.exitCode != 0) {
                        Notifications.Bus
                                .notify(NOTIFICATION_GROUP
                                        .createNotification(
                                                NOTIFICATION_GROUP_ID,
                                                "<p>Failed to invoke racket lint tool</p><p>Make sure you have run <code>raco pkg install intellij</code></p>",
                                                NotificationType.ERROR))
                    }
                }
            })
            handler.startNotify()
            if (!handler.waitFor(2000)) {
                handler.destroyProcess()
            }
        }
    }
}
