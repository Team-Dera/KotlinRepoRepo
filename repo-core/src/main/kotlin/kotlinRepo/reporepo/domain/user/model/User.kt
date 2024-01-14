package kotlinRepo.reporepo.domain.user.model

import kotlinRepo.reporepo.common.annotation.Aggregate
import java.util.UUID

@Aggregate
data class User(

    val id: UUID = UUID(0, 0),

    val userName: String,

    val accountId: String,

    val password: String,

)
