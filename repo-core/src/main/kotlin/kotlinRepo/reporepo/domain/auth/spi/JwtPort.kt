package kotlinRepo.reporepo.domain.auth.spi

import kotlinRepo.reporepo.domain.auth.dto.response.TokenResponse
import java.util.*

interface JwtPort {
    fun generateTokens(userId: UUID): TokenResponse

}