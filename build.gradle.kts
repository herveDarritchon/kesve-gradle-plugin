plugins {
    `java-gradle-plugin`
    //kotlin("jvm") version "1.3.41"
    `kotlin-dsl`
    `maven-publish`
    groovy
}

group = "fr.hervedarritchon.utils.kesve"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("kesvePlugin") {
            id = "fr.hervedarritchon.utils.kesve-plugin"
            implementationClass = "fr.hervedarritchon.utils.kesve.KesvePlugin"
        }
    }
}
 //apply<KesvePlugin>()

publishing {
    repositories {
        maven(url = "build/repository")
    }
}