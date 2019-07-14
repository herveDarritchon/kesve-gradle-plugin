package fr.hdarritchon.sample.goodbye

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

/**
 * Created by Hervé Darritchon on 2019-07-14.
 *
 */
class GoodbyePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val goodbye = project.tasks.create("goodbye")
        goodbye.doLast(object : Action<Task> {
            override fun execute(task: Task) {
                task.logger.lifecycle("Goodbye!")
            }
        })
    }
}