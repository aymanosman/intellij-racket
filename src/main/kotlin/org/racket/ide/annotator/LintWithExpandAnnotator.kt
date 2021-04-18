package org.racket.ide.annotator

import com.intellij.execution.ExecutionException
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.ExternalAnnotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiFile
import org.racket.ide.analysis.RacketAnalysis
import org.racket.ide.inspections.LintWithExpandInspection

class LintWithExpandAnnotator : ExternalAnnotator<PsiFile, Collection<RacketAnalysis.Problem>>() {
    override fun getPairedBatchInspectionShortName(): String {
        return LintWithExpandInspection.INSPECTION_SHORT_NAME
    }

    override fun collectInformation(file: PsiFile, editor: Editor, hasErrors: Boolean): PsiFile? {
        if (hasErrors) return null

        return file
    }

    override fun doAnnotate(file: PsiFile?): Collection<RacketAnalysis.Problem>? {
        if (file == null) return null
        return getProblems(file)
    }

    override fun apply(file: PsiFile, annotationResult: Collection<RacketAnalysis.Problem>?, holder: AnnotationHolder) {
        if (annotationResult == null || !file.isValid) return

        annotationResult.forEach { problem ->
            val element = file.findElementAt(problem.offset) ?: return

            holder.newAnnotation(HighlightSeverity.ERROR, problem.message)
                    .range(element)
                    .create()
        }
    }

    companion object {
        fun getProblems(file: PsiFile): Collection<RacketAnalysis.Problem>? {
            return try {
                RacketAnalysis.lintWithExpand(file)
            } catch (e: ExecutionException) {
                // TODO
                null
            }
        }
    }
}
