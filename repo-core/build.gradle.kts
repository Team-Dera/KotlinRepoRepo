plugins {
    kotlin("plugin.allopen") version "1.6.21"
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("plugin.spring") version "1.9.21"
    kotlin("plugin.jpa") version "1.9.21"
}

dependencies {


    implementation("org.springframework:spring-tx:5.3.22")

    implementation("org.aspectj:aspectjweaver:1.9.7")
}

allOpen {
    annotation("kotlinRepo.reporepo.common.annotation.UseCase")
    annotation("kotlinRepo.reporepo.common.annotation.ReadOnlyUseCase")
    annotation("kotlinRepo.reporepo.common.annotation.SchedulerUseCase")
    annotation("kotlinRepo.reporepo.common.annotation.Service")
}

springBoot {
    mainClass = "kotlinRepo.reporepo.RepoRepoApplication"
}