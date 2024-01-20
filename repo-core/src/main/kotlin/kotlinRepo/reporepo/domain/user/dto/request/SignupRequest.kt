package kotlinRepo.reporepo.domain.user.dto.request

data class SignupRequest (
    val username: String,
    val accountId: String,
    val password: String
)