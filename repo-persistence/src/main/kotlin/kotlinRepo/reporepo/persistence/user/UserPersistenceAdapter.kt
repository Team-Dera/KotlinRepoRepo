package kotlinRepo.reporepo.persistence.user

import kotlinRepo.reporepo.domain.user.spi.UserPort
import kotlinRepo.reporepo.persistence.user.mapper.UserMapper
import kotlinRepo.reporepo.persistence.user.repository.UserJpaRepository
import org.springframework.stereotype.Component

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
