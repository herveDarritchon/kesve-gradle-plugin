plugins {
    `maven-publish`
    `java-gradle-plugin`
    `kotlin-dsl`
}

group = "fr.hdarritchon.utils.kesve"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

gradlePlugin {
    plugins {
        create("kesve-gradle-plugin") {
            id = "fr.hdarritchon.utils.kesve.kesve-gradle-plugin"
            implementationClass = "fr.hdarritchon.utils.kesve.KesveGradlePlugin"
        }
    }
}
