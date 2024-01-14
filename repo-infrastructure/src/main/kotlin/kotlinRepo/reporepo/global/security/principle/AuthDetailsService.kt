package kotlinRepo.reporepo.global.security.principle

import kotlinRepo.reporepo.domain.user.spi.QueryUserPort
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Component

@Component
class AuthDetailsService(
    private val queryUserPort: QueryUserPort,
): UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails {
        val user = queryUserPort.queryUserByUsername(username)
            ?: throw UsernameNotFoundException("User not found with username: $username")
        return AuthDetails(
            userId = user.id
        )
    }

}