package kotlinRepo.reporepo.domain.user.spi

import kotlinRepo.reporepo.domain.user.model.User
import java.util.UUID

interface QueryUserPort {
    fun queryUserByAccountId(accountId: String) : User?

    fun queryUserByUsername(username: String?) : User?
}