package kotlinRepo.reporepo.domain.user.spi

import kotlinRepo.reporepo.domain.user.model.User
import java.util.*

interface QueryUserPort {

    fun queryUserByUsername(username: String?) : User?

    fun queryUserById(userId: UUID): User?

}