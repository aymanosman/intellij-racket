package org.racket.ide.settings

import com.intellij.openapi.options.Configurable
import org.racket.MyBundle
import javax.swing.JComponent

class RacketSettingsConfigurable : Configurable {
    override fun getDisplayName(): String {
        return MyBundle.message("racket.settings.display.name")
    }

    private var mySettingsComponent: RacketSettingsComponent? = null

    override fun createComponent(): JComponent? {
        mySettingsComponent = RacketSettingsComponent()
        return mySettingsComponent!!.panel
    }

    override fun getPreferredFocusedComponent(): JComponent? {
        return mySettingsComponent?.racketPathField
    }

    override fun isModified(): Boolean {
        val settings = RacketSettings.getInstance()
        val racketPathField = mySettingsComponent!!.racketPathField
        return settings.racketPath != racketPathField.text
    }

    override fun apply() {
        val settings = RacketSettings.getInstance()
        val racketPathField = mySettingsComponent!!.racketPathField
        settings.racketPath = racketPathField.text
    }

    override fun reset() {
        val settings = RacketSettings.getInstance()
        mySettingsComponent?.racketPathField?.text = settings.racketPath
    }

    override fun disposeUIResources() {
        mySettingsComponent = null
    }
}
