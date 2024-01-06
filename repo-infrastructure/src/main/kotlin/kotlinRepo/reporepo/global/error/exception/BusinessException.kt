package kotlinRepo.reporepo.global.error.exception


open class BusinessException(
        val errorProperty: ErrorProperty
): RuntimeException() {
}