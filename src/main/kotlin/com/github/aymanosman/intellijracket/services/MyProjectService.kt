package com.github.aymanosman.intellijracket.services

import com.intellij.openapi.project.Project
import com.github.aymanosman.intellijracket.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
