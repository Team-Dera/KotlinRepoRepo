package kotlinRepo.reporepo.domain.user.exception

import kotlinRepo.reporepo.common.error.RepoRepoException
import kotlinRepo.reporepo.domain.user.exception.error.UserErrorCode

object UserAccountIdExistsException : RepoRepoException(
    UserErrorCode.USER_ACCOUNT_ID_EXISTS
)
