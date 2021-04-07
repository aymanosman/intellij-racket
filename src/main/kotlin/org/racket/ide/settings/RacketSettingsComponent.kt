package org.racket.ide.settings

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.ui.TextComponentAccessor
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.util.ui.FormBuilder
import javax.swing.JPanel

class RacketSettingsComponent {
    val racketPathField = TextFieldWithBrowseButton()
    val panel = FormBuilder.createFormBuilder()
            .addLabeledComponent("Path to Racket executable", racketPathField, 1, false)
            .addComponentFillVertically(JPanel(), 0)
            .panel

    init {
        racketPathField.addBrowseFolderListener(
                "Executable Path",
                null,
                null,
                FileChooserDescriptorFactory.createSingleFileDescriptor(),
                TextComponentAccessor.TEXT_FIELD_SELECTED_TEXT
        )
    }
}
