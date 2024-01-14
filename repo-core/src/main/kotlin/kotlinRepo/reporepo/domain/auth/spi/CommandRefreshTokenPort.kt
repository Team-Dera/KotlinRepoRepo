package kotlinRepo.reporepo.domain.auth.spi

import kotlinRepo.reporepo.domain.auth.model.RefreshToken

interface CommandRefreshTokenPort {
    fun save(refreshToken: RefreshToken): RefreshToken
}