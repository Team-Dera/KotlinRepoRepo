package kotlinRepo.reporepo.domain.auth.spi

import kotlinRepo.reporepo.domain.auth.model.RefreshToken
import kotlinRepo.reporepo.domain.user.model.User

interface CommandRefreshTokenPort {
    fun save(refreshToken: RefreshToken): RefreshToken
}