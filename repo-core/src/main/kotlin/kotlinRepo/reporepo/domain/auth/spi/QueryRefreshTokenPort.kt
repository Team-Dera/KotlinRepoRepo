package kotlinRepo.reporepo.domain.auth.spi

import kotlinRepo.reporepo.domain.auth.model.RefreshToken

interface QueryRefreshTokenPort {

    fun queryRefreshTokenByToken(token: String): RefreshToken?

}