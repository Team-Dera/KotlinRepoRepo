package kotlinRepo.reporepo.persistence.user.repository

import kotlinRepo.reporepo.persistence.user.entity.UserJpaEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserJpaRepository : CrudRepository<UserJpaEntity, UUID> {

    fun findByAccountId(accountId: String) : UserJpaEntity

    fun findByUsername(username: String?) : UserJpaEntity
}