package kotlinRepo.reporepo.persistence

interface GenericMapper<D, E> {

    fun toDomain(entity: E?): D?

    fun toEntity(domain: D): E
}
