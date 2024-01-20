plugins {
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("plugin.spring") version "1.9.21"
    kotlin("plugin.jpa") version "1.9.21"
}

dependencies {

    //impl project
    implementation(project(":repo-core"))

    //jpa
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    //mysql
    runtimeOnly("com.mysql:mysql-connector-j")

    //redis
    implementation("org.springframework.boot:spring-boot-starter-data-redis")

    implementation("com.fasterxml.uuid:java-uuid-generator:3.1.4")
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

noArg {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}
repositories {
    mavenCentral()
}

springBoot {
    mainClass = "kotlinRepo.reporepo.RepoRepoApplication"
}