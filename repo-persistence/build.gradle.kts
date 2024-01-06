plugins {
    kotlin("plugin.spring") version "1.9.21"
    kotlin("plugin.jpa") version "1.9.21"}

dependencies {

    //impl project
    implementation(project(":repo-core"))

    //jpa
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    //mysql
    runtimeOnly("com.mysql:mysql-connector-j")

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