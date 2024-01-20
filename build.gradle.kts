import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.1"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm") version "1.9.21"
}

group = "kotlinRepo"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

subprojects {
	apply {
		plugin("org.jetbrains.kotlin.jvm")
		version = "1.7.22"
	}

	apply {
		plugin("org.jetbrains.kotlin.kapt")
		version = "1.7.10"
	}

	dependencies {

		// kotlin
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	}
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

allprojects {
	group = "com.info"
	version = "0.0.1-SNAPSHOT"

	apply(plugin = "jacoco")

	tasks {
		compileKotlin {
			kotlinOptions {
				freeCompilerArgs = listOf("-Xjsr305=strict")
				jvmTarget = "17"
			}
		}

		compileJava {
			sourceCompatibility = JavaVersion.VERSION_17.majorVersion
		}

		test {
			useJUnitPlatform()
		}
	}

	repositories {
		mavenCentral()
	}
}


tasks.getByName<Jar>("jar") {
	enabled = false
}

springBoot {
	mainClass = "kotlinRepo.reporepo.RepoRepoApplication"
}