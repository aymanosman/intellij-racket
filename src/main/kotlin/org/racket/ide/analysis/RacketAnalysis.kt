package org.racket.ide.analysis

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.CapturingProcessAdapter
import com.intellij.execution.process.OSProcessHandler
import com.intellij.execution.process.ProcessEvent
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.util.Ref
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import org.racket.ide.RacketSdkUtil
import org.racket.lang.core.lexer.RacketLexerAdapter
import org.racket.lang.core.psi.RacketElementTypes
import java.nio.charset.StandardCharsets

class RacketAnalysis {
    companion object {

        fun unusedRequires(file: PsiFile): Collection<Problem>? {
            return runCommand("intellij/unused-requires", file)
        }

        fun lintWithExpand(file: PsiFile): Collection<Problem>? {
            return runCommand("intellij/lint-with-expand", file)
        }

        private fun runCommand(command: String, file: PsiFile): Collection<Problem>? {
            val racketPath = RacketSdkUtil.getRacketPath(file.project) ?: return null

            val commandLine: GeneralCommandLine = GeneralCommandLine()
                    .withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE)
                    .withWorkDirectory(file.virtualFile.parent.path)
                    .withExePath(racketPath)
                    .withParameters(listOf("-lm", command, "--", "--stdin", file.virtualFile.name))
            val handler = OSProcessHandler(commandLine)

            return getOutputProblems(handler, file.text.toByteArray(StandardCharsets.UTF_8))
        }

        private fun getOutputProblems(handler: OSProcessHandler, stdin: ByteArray): Collection<Problem>? {
            val response: Ref<Collection<Problem>> = Ref.create()
            handler.addProcessListener(object : CapturingProcessAdapter() {
                override fun processTerminated(event: ProcessEvent) {
                    when (event.exitCode) {
                        0 -> {
                            response.set(output.stdoutLines.mapNotNull { line ->
                                parseProblem(line)
                            })
                        }
                        137 -> {
                            LOG.warn("Racket analysis process terminated")
                        }
                        else -> {
                            RacketSdkUtil.checkRacketIntellijPackageInstalled()
                        }
                    }
                }
            })

            handler.startNotify()
            handler.processInput.write(stdin)
            handler.processInput.close()

            if (!handler.waitFor(TIMEOUT_IN_MILLISECONDS.toLong())) {
                handler.destroyProcess()
            }

            return response.get()
        }

        private fun parseProblem(line: String): Problem? {
            val lexer = RacketLexerAdapter()
            lexer.start(line)

            val offset = if (lexer.tokenType == RacketElementTypes.NUMBER) lexer.tokenText.toInt() else return null

            lexer.advance()

            while (lexer.tokenType == TokenType.WHITE_SPACE) {
                lexer.advance()
            }

            val message =
                    if (lexer.tokenType == RacketElementTypes.STRING)
                        lexer.tokenText // TODO remove quotes
                    else "error encountered"

            return Problem(offset, message)
        }

        private const val TIMEOUT_IN_MILLISECONDS = 10000
        private val LOG = Logger.getInstance(RacketAnalysis::class.java)
    }

    data class Problem(val offset: Int, val message: String)
}
