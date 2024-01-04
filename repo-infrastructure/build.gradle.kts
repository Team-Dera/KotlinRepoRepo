plugins {
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.21"
    kotlin("plugin.spring") version "1.9.21"
    kotlin("plugin.jpa") version "1.9.21"}

group = "kotlinRepo"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    //validation
    implementation("org.springframework.boot:spring-boot-starter-validation")

    //security
    implementation("org.springframework.boot:spring-boot-starter-security")

    //jwt
    implementation("io.jsonwebtoken:jjwt-api:0.10.7")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}