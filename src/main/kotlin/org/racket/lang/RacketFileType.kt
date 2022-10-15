package org.racket.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import org.racket.lang.core.RacketIcons
import javax.swing.Icon

object RacketFileType : LanguageFileType(RacketLanguage) {
    override fun getName(): String = "Racket"

    override fun getDescription(): String = "Racket files"

    override fun getDefaultExtension(): String = "rkt"

    override fun getIcon(): Icon? = RacketIcons.RACKET_FILE

    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"
}
