plugins {
    id("java")
    id("com.diffplug.spotless")
}


java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}