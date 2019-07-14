buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath("fr.hdarritchon.sample:greeting-plugin:0.0.1-SNAPSHOT")
    }
}

plugins {
    `maven-publish`
    `java-gradle-plugin`
    `kotlin-dsl`
}

apply(plugin="fr.hdarritchon.sample.hello")
apply(plugin="fr.hdarritchon.sample.goodbye")

group = "fr.hdarritchon.sample"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {

    implementation("fr.hdarritchon.sample:greeting-plugin:0.0.1-SNAPSHOT")
    implementation(kotlin("stdlib-jdk8"))
}

gradlePlugin {
    plugins {
        create("hello") {
            id = "fr.hdarritchon.sample.hello"
            implementationClass = "fr.hdarritchon.sample.hello.HelloPlugin"
        }
        create("goodbye") {
            id = "fr.hdarritchon.sample.goodbye"
            implementationClass = "fr.hdarritchon.sample.goodbye.GoodbyePlugin"
        }
    }
}

allprojects {
    repositories {
        mavenLocal()
    }
}

publishing {
    repositories {
        mavenLocal()
    }
}