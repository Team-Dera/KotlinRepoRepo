plugins {
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.21"
}

dependencies {

    implementation(project(":repo-core"))


    implementation("org.springframework.boot:spring-boot-starter-validation")

    testImplementation("org.jetbrains.kotlin:kotlin-test")

    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.getByName<Jar>("bootJar") {
    enabled = false
}