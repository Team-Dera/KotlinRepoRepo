package kotlinRepo.reporepo.common.error

interface ErrorProperty {

    fun status(): Int

    fun message(): String

    fun formatMessage(vararg datas: String): ErrorProperty {
        return this.let {
            object : ErrorProperty {
                override fun status(): Int = it.status()
                override fun message(): String = it.message().format(*datas)
            }
        }
    }
}
