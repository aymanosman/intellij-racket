package org.racket.ide.inspections

import com.intellij.codeInspection.LocalInspectionTool
import com.intellij.codeInspection.ex.ExternalAnnotatorBatchInspection

class LintWithExpandInspection: LocalInspectionTool(), ExternalAnnotatorBatchInspection {
    override fun getShortName(): String {
        return INSPECTION_SHORT_NAME
    }

    companion object {
        val INSPECTION_SHORT_NAME = "LINT_WITH_EXPAND"
    }
}
