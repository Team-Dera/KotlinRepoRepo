package kotlinRepo.reporepo.persistence.feed

import kotlinRepo.reporepo.domain.feed.spi.FeedPort
import kotlinRepo.reporepo.persistence.feed.mapper.FeedMapper
import kotlinRepo.reporepo.persistence.feed.repository.FeedJpaRepository
import org.springframework.stereotype.Component

@Component
class FeedPersistenceAdapter (
    private val feedMapper: FeedMapper,
    private val feedJpaRepository: FeedJpaRepository
) : FeedPort {

}