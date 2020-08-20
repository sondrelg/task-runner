package com.github.sondrelg.taskrunner.services

import com.intellij.openapi.project.Project
import com.github.sondrelg.taskrunner.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
