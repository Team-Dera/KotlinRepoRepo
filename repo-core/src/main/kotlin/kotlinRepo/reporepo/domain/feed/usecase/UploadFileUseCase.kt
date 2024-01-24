package kotlinRepo.reporepo.domain.feed.usecase

import kotlinRepo.reporepo.common.annotation.ReadOnlyUseCase
import kotlinRepo.reporepo.domain.feed.spi.FeedPort
import java.io.File

@ReadOnlyUseCase
class UploadFileUseCase (
    private val feedPort: FeedPort
) {

}