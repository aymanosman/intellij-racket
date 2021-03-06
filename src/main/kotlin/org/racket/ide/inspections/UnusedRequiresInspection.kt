package org.racket.ide.inspections

import com.intellij.codeInspection.*
import com.intellij.codeInspection.ex.ExternalAnnotatorBatchInspection

class UnusedRequiresInspection : LocalInspectionTool(), ExternalAnnotatorBatchInspection {
    override fun getShortName(): String {
        return INSPECTION_SHORT_NAME
    }

    companion object {
        val INSPECTION_SHORT_NAME = "UNUSED_REQUIRES"
    }
}
