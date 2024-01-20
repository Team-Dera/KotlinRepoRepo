package kotlinRepo.reporepo.common.service

import kotlinRepo.reporepo.common.annotation.Service
import kotlinRepo.reporepo.common.spi.SecurityPort
import kotlinRepo.reporepo.domain.auth.exception.PasswordMisMatchException

@Service
class SecurityServiceImpl(
    private val securityPort: SecurityPort,
) : SecurityService {

    override fun checkIsPasswordMatches(rawPassword: String, encodedPassword: String) {
        if (!securityPort.isPasswordMatch(rawPassword, encodedPassword)) {
            throw PasswordMisMatchException
        }
    }

    override fun encodePassword(rawPassword: String): String {
        return securityPort.encodePassword(rawPassword)
    }

}