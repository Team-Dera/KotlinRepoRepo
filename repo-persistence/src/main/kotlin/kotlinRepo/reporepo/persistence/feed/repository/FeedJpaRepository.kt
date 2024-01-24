package kotlinRepo.reporepo.persistence.feed.repository

import kotlinRepo.reporepo.persistence.feed.entity.FeedJpaEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface FeedJpaRepository : CrudRepository<FeedJpaEntity, UUID> {

}