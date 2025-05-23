plugins {
    id("my-java-library")
}

//java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(21)
//    }
//}

dependencies {
    implementation(project(":data-model")) // internal
    implementation("org.apache.commons:commons-lang3:3.12.0") // external
}