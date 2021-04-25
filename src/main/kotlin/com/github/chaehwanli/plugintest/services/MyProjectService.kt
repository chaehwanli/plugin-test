package com.github.chaehwanli.plugintest.services

import com.github.chaehwanli.plugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
