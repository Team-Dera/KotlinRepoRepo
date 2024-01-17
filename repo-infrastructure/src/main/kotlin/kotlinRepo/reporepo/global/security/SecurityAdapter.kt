package kotlinRepo.reporepo.global.security

import kotlinRepo.reporepo.common.spi.SecurityPort
import kotlinRepo.reporepo.global.security.principle.CustomDetails
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component
import java.util.*

@Component
class SecurityAdapter(

) : SecurityPort {
    override fun getCurrentUserId(): UUID {
        return (SecurityContextHolder.getContext().authentication.principal as CustomDetails).userId
    }

}