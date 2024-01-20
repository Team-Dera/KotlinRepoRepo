package kotlinRepo.reporepo.domain.user.usecase

import kotlinRepo.reporepo.common.annotation.UseCase
import kotlinRepo.reporepo.common.service.SecurityService
import kotlinRepo.reporepo.domain.auth.dto.response.TokenResponse
import kotlinRepo.reporepo.domain.auth.spi.JwtPort
import kotlinRepo.reporepo.domain.user.dto.request.SignupRequest
import kotlinRepo.reporepo.domain.user.model.User
import kotlinRepo.reporepo.domain.user.service.UserService

@UseCase
class SignupUseCase(
    private val userService: UserService,
    private val jwtPort: JwtPort,
    private val securityService: SecurityService
) {

    fun execute(request: SignupRequest) : TokenResponse {

        userService.checkUserExistsByAccountId(request.accountId)

        val user = userService.saveUser(
            User(
                userName = request.username,
                accountId = request.accountId,
                password = securityService.encodePassword(request.password)
            )
        )

        return jwtPort.generateTokens(user.id)
    }
}