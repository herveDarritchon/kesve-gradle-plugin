package fr.hervedarritchon.utils.kesve.kesveplugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by Hervé Darritchon on 2019-06-27.
 *
 */

open class KesvePluginExtension {
    var message = "Hello from KesvePlugin"
    var greeter = "if it works"
}

open class KesveTask : DefaultTask() {
    lateinit var messageText: String
    lateinit var webhookUrl: String

    @TaskAction
    fun displayMessage() {
        println("$messageText from $webhookUrl")
    }
}