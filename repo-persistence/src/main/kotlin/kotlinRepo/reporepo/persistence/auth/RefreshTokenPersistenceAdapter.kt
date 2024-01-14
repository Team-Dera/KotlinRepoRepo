package kotlinRepo.reporepo.persistence.auth

import kotlinRepo.reporepo.domain.auth.model.RefreshToken
import kotlinRepo.reporepo.domain.auth.spi.RefreshTokenPort
import kotlinRepo.reporepo.persistence.auth.mapper.RefreshTokenMapper
import kotlinRepo.reporepo.persistence.auth.repository.RefreshTokenRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Component
class RefreshTokenPersistenceAdapter(
    private val refreshTokenMapper: RefreshTokenMapper,
    private val refreshTokenRepository: RefreshTokenRepository
) : RefreshTokenPort {

    override fun queryRefreshTokenByToken(token: String) = refreshTokenMapper.toDomain(
        refreshTokenRepository.findByIdOrNull(token)
    )

    override fun save(refreshToken: RefreshToken) = refreshTokenMapper.toDomain(
        refreshTokenRepository.save(
            refreshTokenMapper.toEntity(refreshToken)
        )
    )!!
}