package kotlinRepo.reporepo.global.security

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class SecurityProperties(
    @Value("\${secret.secretKey}")
    val secretKey: String,

    @Value("\${secret.accessExp}")
    val accessExp: Int,

    @Value("\${secret.refreshExp}")
    val refreshExp: Int
)