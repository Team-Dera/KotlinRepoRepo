plugins {
    kotlin("jvm")
}

group = "kotlinRepo"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}