plugins {
    id("my-java-library") // id(java-library') applies id("java")
}

// extension in gradle
// uses the `java` plugin applied above
//java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(21)
//    }
//}