package kotlinRepo.reporepo.persistence.feed.mapper

import kotlinRepo.reporepo.domain.feed.model.Feed
import kotlinRepo.reporepo.persistence.GenericMapper
import kotlinRepo.reporepo.persistence.feed.entity.FeedJpaEntity
import org.springframework.stereotype.Component

@Component
class FeedMapper() : GenericMapper<Feed, FeedJpaEntity> {

    override fun toDomain(entity: FeedJpaEntity?): Feed? {
        return entity?.let {
            Feed(
                id = it.id!!,
                title = it.title,
                imageUrl = it.imageUrl
            )
        }
    }

    override fun toEntity(domain: Feed): FeedJpaEntity {
        return FeedJpaEntity(
            id = domain.id,
            title = domain.title,
            imageUrl = domain.imageUrl
        )
    }
}