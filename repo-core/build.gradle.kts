plugins {
    kotlin("plugin.allopen") version "1.6.21"
}

dependencies {

    implementation("org.springframework:spring-tx:5.3.22")

    implementation("org.aspectj:aspectjweaver:1.9.7")
}

allOpen {
    annotation("team.aliens.dms.common.annotation.UseCase")
    annotation("team.aliens.dms.common.annotation.ReadOnlyUseCase")
    annotation("team.aliens.dms.common.annotation.SchedulerUseCase")
    annotation("team.aliens.dms.common.annotation.Service")
}