package kotlinRepo.reporepo.thirdparty

import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class AwsProperties(
    @Value("\${cloud.aws.credentials.awsAccessKey}")
    val accessKey: String,

    @Value("\${cloud.aws.credentials.awsSecretKey}")
    val secretKey: String
)

