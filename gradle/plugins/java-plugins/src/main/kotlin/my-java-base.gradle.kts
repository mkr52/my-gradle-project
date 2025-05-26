plugins {
    id("java")
    id("com.diffplug.spotless")
}


java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks.compileJava {
    options.release.set(21)

}

// Another way to set the task via a named feature. Equivalent to "tasks.compileTestJava{}"
tasks.named<JavaCompile>("compileTestJava") {
}

tasks.test {

}

tasks.javadoc {

}