package kotlinRepo.reporepo.persistence.user.mapper

import kotlinRepo.reporepo.domain.user.model.User
import kotlinRepo.reporepo.persistence.GenericMapper
import kotlinRepo.reporepo.persistence.user.entity.UserJpaEntity
import org.springframework.stereotype.Component

@Component
class UserMapper() : GenericMapper<User, UserJpaEntity> {

    override fun toDomain(entity: UserJpaEntity?): User? {
        return entity?.let {
            User(
                id = it.id!!,
                userName = it.username,
                accountId = it.accountId,
                password = it.password
            )
        }
    }

    override fun toEntity(domain: User): UserJpaEntity {
        return UserJpaEntity(
            id = domain.id,
            username = domain.userName,
            accountId = domain.accountId,
            password = domain.password
        )
    }
}