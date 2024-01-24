package kotlinRepo.reporepo.domain.feed.service

import kotlinRepo.reporepo.common.annotation.Service

@Service
class FeedService(
    checkFeedService: CheckFeedService,
    commandFeedService: CommandFeedService,
    getFeedService: GetFeedService
) : CheckFeedService by checkFeedService,
        GetFeedService by getFeedService,
        CommandFeedService by commandFeedService