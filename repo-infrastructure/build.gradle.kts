plugins {
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("plugin.spring") version "1.9.21"
    kotlin("plugin.jpa") version "1.9.21"
}

dependencies {

    //s3
    implementation ("com.amazonaws:aws-java-sdk-s3:1.12.281")

    //aws
    implementation ("org.springframework.cloud:spring-cloud-starter-aws:2.2.6.RELEASE")

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
    implementation("io.jsonwebtoken:jjwt-api:0.11.2")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.11.2")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.11.2")

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

