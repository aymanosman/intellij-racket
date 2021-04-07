package org.racket.ide.settings

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.options.ShowSettingsUtil
import com.intellij.openapi.project.DumbAwareAction

class OpenRacketSettings : DumbAwareAction("Open Racket Settings") {
    override fun actionPerformed(e: AnActionEvent) {
        ShowSettingsUtil.getInstance().showSettingsDialog(e.getRequiredData(CommonDataKeys.PROJECT), RacketSettingsConfigurable::class.java)
    }
}
