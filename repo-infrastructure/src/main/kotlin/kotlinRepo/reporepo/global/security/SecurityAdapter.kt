package kotlinRepo.reporepo.global.security

import kotlinRepo.reporepo.common.spi.SecurityPort
import kotlinRepo.reporepo.global.security.principle.CustomDetails
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component
import java.util.*

@Component
class SecurityAdapter(
    private val passwordEncoder: PasswordEncoder
) : SecurityPort {
    override fun getCurrentUserId(): UUID {
        return (SecurityContextHolder.getContext().authentication.principal as CustomDetails).userId
    }

    override fun isPasswordMatch(rawPassword: String, encodedPassword: String) = passwordEncoder.matches(
        rawPassword, encodedPassword
    )

    override fun encodePassword(rawPassword: String): String = passwordEncoder.encode(rawPassword)
}