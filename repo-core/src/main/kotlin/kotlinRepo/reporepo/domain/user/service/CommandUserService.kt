package kotlinRepo.reporepo.domain.user.service

import kotlinRepo.reporepo.domain.user.model.User

interface CommandUserService {

    fun saveUser(user: User): User
}