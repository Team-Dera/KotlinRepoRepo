package kotlinRepo.reporepo.domain.feed

import jakarta.annotation.Nonnull
import kotlinRepo.reporepo.common.dto.response.UploadFileResponse
import kotlinRepo.reporepo.domain.feed.usecase.UploadFileUseCase
import org.jetbrains.annotations.NotNull
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.io.FileOutputStream
import java.util.*

@RequestMapping("/feed")
@RestController
class FeedWebAdapter (
    private val uploadFileUseCase: UploadFileUseCase
) {

    /*
    @PostMapping
    fun uploadFile(@RequestPart @NotNull file: MultipartFile?): UploadFileResponse {
        val result = uploadFileUseCase.execute(
            file!!.toFile()
        )
        return UploadFileResponse(result)
    }
*/


    fun MultipartFile.toFile() =
        File("${UUID.randomUUID()}||$originalFilename").let {
            FileOutputStream(it).run {
                this.write(bytes)
                this.close()
            }
            it
        }
}