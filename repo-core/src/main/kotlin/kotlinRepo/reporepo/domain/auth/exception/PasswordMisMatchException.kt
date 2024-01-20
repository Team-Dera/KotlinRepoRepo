package kotlinRepo.reporepo.domain.auth.exception

import kotlinRepo.reporepo.common.error.RepoRepoException
import kotlinRepo.reporepo.domain.user.exception.error.UserErrorCode

object PasswordMisMatchException : RepoRepoException(
    UserErrorCode.PASSWORD_MISMATCH
)
