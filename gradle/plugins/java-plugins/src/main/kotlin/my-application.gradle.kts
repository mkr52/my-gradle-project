plugins {
    id("application")
    id("my-java-base")
}

tasks.register<Zip>("bundle") {
    group = "My Group"
    description = "package it all!"

    from(tasks.jar) // includes the main classes
    from(configurations.runtimeClasspath) // includes runtime dependencies

    destinationDirectory.set(layout.buildDirectory.dir("distribution"))
}