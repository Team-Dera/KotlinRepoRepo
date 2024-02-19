package kotlinRepo.reporepo.domain.user

import jakarta.validation.Valid
import kotlinRepo.reporepo.domain.auth.dto.response.TokenResponse
import kotlinRepo.reporepo.domain.user.dto.request.LoginRequest
import kotlinRepo.reporepo.domain.user.dto.request.SignupRequest
import kotlinRepo.reporepo.domain.user.dto.request.LoginWebRequest
import kotlinRepo.reporepo.domain.user.dto.request.SignupWebRequest
import kotlinRepo.reporepo.domain.user.usecase.LoginUseCase
import kotlinRepo.reporepo.domain.user.usecase.SignupUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/user")
@RestController
class UserWebAdapter (
    private val signupUseCase: SignupUseCase,
    private val loginUseCase: LoginUseCase
) {

    @PostMapping("/signup")
    fun signup(@RequestBody @Valid webRequest: SignupWebRequest) : TokenResponse {
        val request = SignupRequest(
            username =  webRequest.username,
            accountId = webRequest.accountId,
            password = webRequest.password
        )
         return signupUseCase.execute(request)
    }

    @PostMapping("/login")
    fun login(@RequestBody @Valid webRequest: LoginWebRequest) : TokenResponse {
        val request = LoginRequest(
            accountId = webRequest.accountId,
            password =  webRequest.password

        )
        return loginUseCase.execute(request)
    }
}
