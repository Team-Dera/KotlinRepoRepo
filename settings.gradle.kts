plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "RepoRepo"
include("repo-core")
include("repo-presentation")
include("repo-persistence")
include("repo-infrastructure")
