package kotlinRepo.reporepo.thirdparty

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class AwsProperties(
    @Value("\${cloud.aws.credentials.awsAccessKey}")
    val accessKey: String,

    @Value("\${cloud.aws.credentials.awsSecretKey}")
    val secretKey: String
)