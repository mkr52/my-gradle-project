plugins {
    id("my-application")
}

//java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(21)
//    }
//}

application {
    mainClass.set("com.example.MyApplication")
}

dependencies {
    implementation(project(":data-model"))
    implementation(project(":business-logic"))
}