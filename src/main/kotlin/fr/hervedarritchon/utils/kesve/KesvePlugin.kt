package fr.hervedarritchon.utils.kesve

import fr.hervedarritchon.utils.kesve.kesveplugin.KesvePluginExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by Hervé Darritchon on 2019-06-27.
 *
 */
class KesvePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create("greeting", KesvePluginExtension::class.java)
        project.task("hello") {
            doLast {
                println("${extension.message} from ${extension.greeter}")
            }
        }
//        project.run {
//
//            tasks {
//                register("kesveGenerateSource", KesveTask::class) {
//                    group = "fr.hervedarritchon.utils.kesve"
//                    messageText = "Greeting"
//                    webhookUrl = "https://github.com/herveDarritchon/kesve"
//                }
//            }
//        }
    }
}