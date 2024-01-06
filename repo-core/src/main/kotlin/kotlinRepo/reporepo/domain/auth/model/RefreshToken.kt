package kotlinRepo.reporepo.domain.auth.model


//@Aggregate

data class RefreshToken(

    val token: String,

    val userId: Long,

    val expiration: Long

)
