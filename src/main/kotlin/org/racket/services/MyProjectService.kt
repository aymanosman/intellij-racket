package org.racket.services

import com.intellij.openapi.project.Project
import org.racket.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
