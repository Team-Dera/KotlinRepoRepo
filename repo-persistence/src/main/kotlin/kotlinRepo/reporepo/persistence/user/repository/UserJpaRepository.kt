package kotlinRepo.reporepo.persistence.user.repository

import kotlinRepo.reporepo.persistence.user.entity.UserJpaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserJpaRepository : JpaRepository<UserJpaEntity, UUID> {

    fun findByAccountId(accountId: String?) : UserJpaEntity

    fun findByUsername(username: String?) : UserJpaEntity

    fun findUserJpaEntityById(userId: UUID) : UserJpaEntity

    fun existsByAccountId(accountId: String?) : Boolean
}