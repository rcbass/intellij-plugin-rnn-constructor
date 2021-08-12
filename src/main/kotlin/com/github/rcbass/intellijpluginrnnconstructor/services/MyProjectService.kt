package com.github.rcbass.intellijpluginrnnconstructor.services

import com.github.rcbass.intellijpluginrnnconstructor.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
