package kotlinRepo.reporepo.persistence

import com.fasterxml.uuid.Generators
import org.hibernate.engine.spi.SharedSessionContractImplementor
import org.hibernate.id.IdentifierGenerator
import java.io.Serializable

class TimeBasedUUIDGenerator : IdentifierGenerator{

    override fun generate(session: SharedSessionContractImplementor?, entity: Any?): Serializable {
        return Generators.timeBasedGenerator().generate()
    }
}