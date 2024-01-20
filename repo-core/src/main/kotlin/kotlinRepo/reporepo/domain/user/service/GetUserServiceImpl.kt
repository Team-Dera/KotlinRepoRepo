package kotlinRepo.reporepo.domain.user.service

import kotlinRepo.reporepo.common.annotation.Service
import kotlinRepo.reporepo.common.spi.SecurityPort
import kotlinRepo.reporepo.domain.user.exception.UserNotFoundException
import kotlinRepo.reporepo.domain.user.model.User
import kotlinRepo.reporepo.domain.user.spi.QueryUserPort
import java.util.*

@Service
class GetUserServiceImpl (
    private val queryUserPort: QueryUserPort,
    private val securityPort: SecurityPort
) : GetUserService {

    override fun queryUserById(userId: UUID) =
        queryUserPort.queryUserById(userId) ?: throw UserNotFoundException


    override fun getCurrentUser(): User {
        val currentUserId = securityPort.getCurrentUserId()
        return queryUserById(currentUserId)
    }

    override fun queryUserByAccountId(accountId: String) =
        queryUserPort.queryUserByAccountId(accountId) ?: throw UserNotFoundException

}