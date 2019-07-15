plugins {
    `maven-publish`
    `java-gradle-plugin`
    `kotlin-dsl`
}

group = "fr.hdarritchon.sample"

repositories {
    mavenCentral()
}

dependencies {
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
