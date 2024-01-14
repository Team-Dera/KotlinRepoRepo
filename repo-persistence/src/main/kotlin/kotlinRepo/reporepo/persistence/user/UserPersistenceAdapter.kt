package kotlinRepo.reporepo.persistence.user

import kotlinRepo.reporepo.domain.user.model.User
import kotlinRepo.reporepo.domain.user.spi.UserPort
import kotlinRepo.reporepo.persistence.user.mapper.UserMapper
import kotlinRepo.reporepo.persistence.user.repository.UserJpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import java.util.*

@Component
class UserPersistenceAdapter (
    private val userMapper: UserMapper,
    private val userJpaRepository: UserJpaRepository
) : UserPort {

    override fun queryUserByAccountId(accountId: String) = userMapper.toDomain(
        userJpaRepository.findByAccountId(accountId)

    )

    override fun queryUserByUsername(username: String?) = userMapper.toDomain (
        userJpaRepository.findByUsername(username)
    )

}
