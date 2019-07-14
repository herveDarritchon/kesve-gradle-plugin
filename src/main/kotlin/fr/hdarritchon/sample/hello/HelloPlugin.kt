package fr.hdarritchon.sample.hello

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

/**
 * Created by Hervé Darritchon on 2019-07-14.
 *
 */
class HelloPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val hello = project.tasks.create("hello")
        hello.doLast(object : Action<Task> {
            override fun execute(task: Task) {
                task.logger.lifecycle("Hello!")
            }
        })
    }
}