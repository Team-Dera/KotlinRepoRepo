package kotlinRepo.reporepo.domain.auth.spi

import kotlinRepo.reporepo.domain.auth.model.RefreshToken
import kotlinRepo.reporepo.domain.user.model.User

interface QueryRefreshTokenPort {

    fun queryRefreshTokenByToken(token: String): RefreshToken?

}