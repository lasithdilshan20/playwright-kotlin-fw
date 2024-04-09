plugins {
    kotlin("jvm") version "1.6.10"
    application
}

group = "com.example"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("com.microsoft.playwright:playwright:1.20.0") // Check for the latest version of Playwright for Java
}

application {
    mainClass.set("com.example.MainKt")
}
