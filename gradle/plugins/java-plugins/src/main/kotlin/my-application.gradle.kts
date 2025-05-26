import com.example.gradle.JarCount

plugins {
    id("application")
    id("my-java-base")
}

tasks.register<JarCount>("countJars") {
    group = "My Group"
    description = "Counts!"

    allJars.from(tasks.jar) // includes the main class
    allJars.from(configurations.runtimeClasspath)

    countFile.set(layout.buildDirectory.file("gen/count.txt"))
}

tasks.register<Zip>("bundle") {
    group = "My Group"
    description = "package it all!"

    from(tasks.jar) // includes the main classes
    from(configurations.runtimeClasspath) // includes runtime dependencies

    destinationDirectory.set(layout.buildDirectory.dir("distribution"))
}