package kotlinRepo.reporepo.persistence.auth.mapper

import kotlinRepo.reporepo.domain.auth.model.RefreshToken
import kotlinRepo.reporepo.persistence.GenericMapper
import kotlinRepo.reporepo.persistence.auth.entity.RefreshTokenEntity
import org.springframework.stereotype.Component

@Component
class RefreshTokenMapper : GenericMapper<RefreshToken, RefreshTokenEntity> {

    override fun toDomain(entity: RefreshTokenEntity?): RefreshToken? {
        return entity?.let {
            RefreshToken(
                token = it.token,
                userId = it.userId,
                expirationTime = it.expirationTime
            )
        }
    }

    override fun toEntity(domain: RefreshToken): RefreshTokenEntity {
        return RefreshTokenEntity(
            token = domain.token,
            userId = domain.userId,
            expirationTime = domain.expirationTime
        )
    }
}
