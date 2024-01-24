package kotlinRepo.reporepo.domain.feed.model

import kotlinRepo.reporepo.common.annotation.Aggregate
import java.util.*

@Aggregate
class Feed (

    val id: UUID = UUID(0, 0),

    val title: String,

    val imageUrl: String,
)