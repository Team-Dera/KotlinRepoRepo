package kotlinRepo.reporepo.common.spi

import java.util.UUID

interface SecurityPort {

    fun getCurrentUserId(): UUID

}