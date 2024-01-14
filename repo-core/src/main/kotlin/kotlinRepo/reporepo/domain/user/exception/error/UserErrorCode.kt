package kotlinRepo.reporepo.domain.user.exception.error

import kotlinRepo.reporepo.common.error.ErrorProperty
import kotlinRepo.reporepo.common.error.ErrorStatus

enum class UserErrorCode(
    private val status: Int,
    private val message: String
) : ErrorProperty {

    USER_NOT_FOUND(ErrorStatus.NOT_FOUND, "User Not Found");

    override fun status(): Int = status
    override fun message(): String = message

}
