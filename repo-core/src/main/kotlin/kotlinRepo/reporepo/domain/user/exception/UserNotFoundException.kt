package kotlinRepo.reporepo.domain.user.exception

import kotlinRepo.reporepo.common.error.RepoRepoException
import kotlinRepo.reporepo.domain.user.exception.error.UserErrorCode

object UserNotFoundException : RepoRepoException(
    UserErrorCode.USER_NOT_FOUND
)
