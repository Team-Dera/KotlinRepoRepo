package kotlinRepo.reporepo.common.spi

import java.util.UUID

interface SecurityPort {

    fun getCurrentUserId(): UUID

    fun isPasswordMatch(rawPassword: String, encodedPassword: String): Boolean

    fun encodePassword(rawPassword: String) : String
}