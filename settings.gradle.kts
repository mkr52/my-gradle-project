pluginManagement {
    repositories.gradlePluginPortal()
//    repositories.google()

    includeBuild("gradle/plugins") // Standard is to write local gradle plugins
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
//        google()
//        maven("https://my-own-repo") {
//            credentials.username ="...."
//            credentials.password="...."
//        }
    }

//    includeBuild("../my-other-project")

}

rootProject.name = "my-gradle"

// app
include("app")

// business-logic
include("business-logic")

// data-model
include("data-model")