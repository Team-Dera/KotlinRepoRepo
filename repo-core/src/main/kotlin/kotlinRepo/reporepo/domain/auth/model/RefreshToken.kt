package kotlinRepo.reporepo.domain.auth.model

import kotlinRepo.reporepo.common.annotation.Aggregate
import java.util.*


@Aggregate
data class RefreshToken(

    val token: String,

    val userId: UUID,

    val expirationTime: Int

)
