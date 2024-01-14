package kotlinRepo.reporepo.persistence.user.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import kotlinRepo.reporepo.persistence.BaseUUIDEntity
import java.util.*

@Entity
@Table(name = "tbl_user")
class UserJpaEntity (

    id: UUID?,

    @Column(columnDefinition = "CHAR(5)", nullable = false)
    val username: String,

    @Column(columnDefinition = "VARCHAR(20)", nullable = false, unique = true)
    val accountId: String,

    @Column(columnDefinition = "CHAR(60)", nullable = false)
    val password: String

) : BaseUUIDEntity(id)