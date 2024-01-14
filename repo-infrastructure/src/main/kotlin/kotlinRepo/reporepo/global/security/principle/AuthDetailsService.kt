package kotlinRepo.reporepo.global.security.principle


import kotlinRepo.reporepo.domain.user.exception.UserNotFoundException
import kotlinRepo.reporepo.domain.user.model.User
import kotlinRepo.reporepo.domain.user.spi.QueryUserPort
import kotlinRepo.reporepo.persistence.user.entity.UserJpaEntity
import kotlinRepo.reporepo.persistence.user.repository.UserJpaRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import java.util.UUID

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