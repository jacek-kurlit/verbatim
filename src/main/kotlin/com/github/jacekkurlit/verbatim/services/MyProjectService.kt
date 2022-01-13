package com.github.jacekkurlit.verbatim.services

import com.intellij.openapi.project.Project
import com.github.jacekkurlit.verbatim.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
