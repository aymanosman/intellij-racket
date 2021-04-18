package org.racket.ide.annotator

import com.intellij.codeInspection.InspectionManager
import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.execution.ExecutionException
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.ExternalAnnotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiFile
import org.racket.ide.analysis.RacketAnalysis
import org.racket.ide.highlight.DeleteUnusedRequireFix
import org.racket.ide.inspections.UnusedRequiresInspection
import org.racket.lang.core.psi.RacketFile

class UnusedRequiresAnnotator : ExternalAnnotator<PsiFile, Collection<RacketAnalysis.Problem>>() {
    override fun getPairedBatchInspectionShortName(): String {
        return UnusedRequiresInspection.INSPECTION_SHORT_NAME
    }

    override fun collectInformation(file: PsiFile, editor: Editor, hasErrors: Boolean): PsiFile? {
        if (!hasErrors && file is RacketFile) {
            return file
        } else {
            return null
        }
    }

    override fun doAnnotate(file: PsiFile?): Collection<RacketAnalysis.Problem>? {
        if (file == null) return null
        return getProblems(file)
    }

    override fun apply(file: PsiFile, annotationResult: Collection<RacketAnalysis.Problem>?, holder: AnnotationHolder) {
        if (annotationResult == null || !file.isValid) return

        annotationResult.forEach { problem ->
            val element = file.findElementAt(problem.offset) ?: return

            val fix = DeleteUnusedRequireFix()
            val problemDescriptor =
                    InspectionManager.getInstance(file.project)
                            .createProblemDescriptor(element,
                                    DESCRIPTION_TEMPLATE,
                                    fix,
                                    ProblemHighlightType.WEAK_WARNING,
                                    false)
            holder.newAnnotation(HighlightSeverity.WEAK_WARNING, "Unused require")
                    .range(element)
                    .newLocalQuickFix(fix, problemDescriptor)
                    .registerFix()
                    .create()
        }
    }

    companion object {
        fun getProblems(file: PsiFile): Collection<RacketAnalysis.Problem>? {

            return try {
                RacketAnalysis.unusedRequires(file)
            } catch (e: ExecutionException) {
                LOG.error(e)
                null
            }
        }

        private val LOG = Logger.getInstance(UnusedRequiresInspection::class.toString())
        const val DESCRIPTION_TEMPLATE = "Unused require <code>#ref</code> #loc"
    }
}
