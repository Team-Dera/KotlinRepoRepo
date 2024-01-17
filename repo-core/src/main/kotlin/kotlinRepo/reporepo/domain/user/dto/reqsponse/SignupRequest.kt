package kotlinRepo.reporepo.domain.user.dto.reqsponse

data class SignupRequest (
    val username: String,
    val accountId: String,
    val password: String
)