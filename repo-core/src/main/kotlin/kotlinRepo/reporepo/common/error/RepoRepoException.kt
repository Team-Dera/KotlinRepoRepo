package kotlinRepo.reporepo.common.error

abstract class RepoRepoException(
    val errorProperty: ErrorProperty
) : RuntimeException()
