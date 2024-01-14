package kotlinRepo.reporepo.persistence

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.GenericGenerator
import java.util.UUID

@MappedSuperclass
abstract class BaseUUIDEntity(

    @Id
    @GeneratedValue(generator = "timeBasedUUID")
    @GenericGenerator(name = "timeBasedUUID", strategy = "kotlinRepo.reporepo.persistence.TimeBasedUUIDGenerator")
    @Column(columnDefinition = "BINARY(16)", nullable = false)
    val id: UUID?

) : BaseTimeEntity()
