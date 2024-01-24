package kotlinRepo.reporepo.persistence.feed.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import kotlinRepo.reporepo.persistence.BaseUUIDEntity
import java.util.*

@Entity
@Table(name = "tbl_feed")
class FeedJpaEntity (

    id: UUID?,

    @Column(columnDefinition = "VARCHAR(30)", nullable = false)
    val title: String,

    @Column(columnDefinition = "VARCHAR(300)", nullable = false)
    val imageUrl: String

) : BaseUUIDEntity(id)