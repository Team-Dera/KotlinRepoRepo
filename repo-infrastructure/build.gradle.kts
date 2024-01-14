plugins {
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("plugin.spring") version "1.9.21"
    kotlin("plugin.jpa") version "1.9.21"
}

dependencies {

    //impl project
    implementation(project(":repo-persistence"))
    implementation(project(":repo-core"))
    implementation(project(":repo-presentation"))

    //validation
    implementation("org.springframework.boot:spring-boot-starter-validation")

    //redis
    implementation("org.springframework.boot:spring-boot-starter-data-redis")

    //security
    implementation("org.springframework.boot:spring-boot-starter-security")

    //jwt
    implementation("io.jsonwebtoken:jjwt-api:0.10.7")

    implementation("org.springframework.boot:spring-boot-starter-web")

}


kapt {
    arguments {
        arg("mapstruct.defaultComponentModel", "spring")
        arg("mapstruct.unmappedTargetPolicy", "ignore")
    }
}

tasks.getByName<Jar>("jar") {
    enabled = false
}
repositories {
    mavenCentral()
}