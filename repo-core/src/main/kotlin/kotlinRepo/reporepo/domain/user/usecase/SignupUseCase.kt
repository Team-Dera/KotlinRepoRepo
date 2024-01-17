package kotlinRepo.reporepo.domain.user.usecase

import kotlinRepo.reporepo.common.annotation.UseCase
import kotlinRepo.reporepo.domain.user.dto.reqsponse.SignupRequest
import kotlinRepo.reporepo.domain.user.service.UserService

@UseCase
class SignupUseCase(
    private val userService: UserService
) {

    fun execute(request: SignupRequest) {

    }
}