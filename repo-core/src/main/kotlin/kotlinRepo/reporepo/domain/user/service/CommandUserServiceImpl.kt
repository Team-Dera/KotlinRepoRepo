package kotlinRepo.reporepo.domain.user.service

import kotlinRepo.reporepo.common.annotation.Service
import kotlinRepo.reporepo.domain.user.model.User
import kotlinRepo.reporepo.domain.user.spi.CommandUserPort

@Service
class CommandUserServiceImpl (
    private val commandUserPort: CommandUserPort,
) : CommandUserService {

    override fun saveUser(user: User) =
        commandUserPort.saveUser(user)

}