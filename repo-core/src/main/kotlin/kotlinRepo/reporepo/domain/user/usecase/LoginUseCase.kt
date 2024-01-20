package kotlinRepo.reporepo.domain.user.usecase

import kotlinRepo.reporepo.common.annotation.UseCase
import kotlinRepo.reporepo.common.service.SecurityService
import kotlinRepo.reporepo.domain.auth.dto.response.TokenResponse
import kotlinRepo.reporepo.domain.auth.spi.JwtPort
import kotlinRepo.reporepo.domain.user.dto.request.LoginRequest
import kotlinRepo.reporepo.domain.user.service.UserService

@UseCase
class LoginUseCase (
    private val userService: UserService,
    private val jwtPort: JwtPort,
    private val securityService: SecurityService
) {
    fun execute(request: LoginRequest) : TokenResponse {
        val user = userService.queryUserByAccountId(request.accountId)

        securityService.checkIsPasswordMatches(request.password, user.password)

        return jwtPort.generateTokens(user.id)
    }
}