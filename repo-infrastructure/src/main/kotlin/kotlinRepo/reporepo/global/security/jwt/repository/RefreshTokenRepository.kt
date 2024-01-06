package kotlinRepo.reporepo.global.security.jwt.repository

import kotlinRepo.reporepo.domain.auth.model.RefreshToken
import org.springframework.data.repository.CrudRepository

interface RefreshTokenRepository : CrudRepository<RefreshToken, String> {
    fun findByToken(token: String): RefreshToken?
}