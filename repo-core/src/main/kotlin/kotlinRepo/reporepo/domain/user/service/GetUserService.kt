package kotlinRepo.reporepo.domain.user.service

import kotlinRepo.reporepo.domain.user.model.User
import java.util.*

interface GetUserService {

    fun queryUserById(userId: UUID): User

    fun getCurrentUser() : User

    fun queryUserByAccountId(accountId: String) : User
}
