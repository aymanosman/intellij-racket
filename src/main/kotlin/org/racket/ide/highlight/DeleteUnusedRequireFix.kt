package org.racket.ide.highlight

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import org.racket.MyBundle

class DeleteUnusedRequireFix : LocalQuickFix {
    override fun getFamilyName(): String {
        return MyBundle.message("delete.unused.require.display.name")
    }

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        descriptor.psiElement.delete()
    }
}
