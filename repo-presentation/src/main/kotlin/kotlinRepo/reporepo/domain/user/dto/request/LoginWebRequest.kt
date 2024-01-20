package kotlinRepo.reporepo.domain.user.dto.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class LoginWebRequest(

    @field:NotBlank
    val accountId: String,

    @field:NotBlank
    @field:Size(min = 8, max = 20)
    val password: String
)
