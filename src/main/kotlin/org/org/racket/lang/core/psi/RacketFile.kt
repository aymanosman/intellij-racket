package org.racket.lang.core.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.racket.lang.RacketFileType
import org.racket.lang.RacketLanguage

class RacketFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, RacketLanguage) {
    override fun getFileType(): FileType {
        return RacketFileType
    }

    override fun toString(): String {
        return "Racket"
    }

}
