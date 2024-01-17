package kotlinRepo.reporepo.domain.user.spi

import kotlinRepo.reporepo.domain.user.model.User

interface CommandUserPort {
    fun saveUser(user: User): User
}