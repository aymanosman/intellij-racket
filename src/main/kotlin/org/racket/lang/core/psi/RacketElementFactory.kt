package org.racket.lang.core.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import org.racket.lang.RacketFileType

object RacketElementFactory {
    fun createForm(project: Project?, name: String?): RacketForm {
        val file = createFile(project, name)
        return file.firstChild as RacketForm
    }

    fun createFile(project: Project?, text: String?): RacketFile {
        val name = "dummy.rkt"
        return PsiFileFactory.getInstance(project)
                .createFileFromText(name, RacketFileType, text!!) as RacketFile
    }
}
