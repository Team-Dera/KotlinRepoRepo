package kotlinRepo.reporepo.global.security.jwt

import io.jsonwebtoken.Header
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import io.jsonwebtoken.security.Keys
import kotlinRepo.reporepo.domain.auth.dto.response.TokenResponse
import kotlinRepo.reporepo.domain.auth.model.RefreshToken
import kotlinRepo.reporepo.domain.auth.spi.CommandRefreshTokenPort
import kotlinRepo.reporepo.domain.auth.spi.JwtPort
import kotlinRepo.reporepo.global.security.SecurityProperties
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.*


@Component
class JwtTokenProvider(
    private val securityProperties: SecurityProperties,
    private val commandRefreshTokenPort: CommandRefreshTokenPort
) : JwtPort {


     override fun generateTokens(userId: UUID): TokenResponse {
        return TokenResponse(
            accessToken = createAccessToken(userId),
            accessTokenExpiredAt = LocalDateTime.now().plusSeconds(securityProperties.accessExp.toLong()),
            refreshToken = createRefreshToken(userId),
            refreshTokenExpiredAt = LocalDateTime.now().plusSeconds(securityProperties.refreshExp.toLong())
        )
    }

    private fun createAccessToken(userId: UUID): String {
        return createToken(userId, JwtProperties.ACCESS, securityProperties.accessExp.toLong())
    }

    private fun createRefreshToken(userId: UUID): String {
        val token = createToken(userId, JwtProperties.REFRESH, securityProperties.refreshExp.toLong())
        commandRefreshTokenPort.save(
            RefreshToken(
                userId = userId,
                token = token,
                expirationTime = securityProperties.refreshExp * 1000
            )
        )
        return token
    }



    private fun createToken(userId: UUID, jwtType: String, exp: Long): String {
        return Jwts.builder()
            .signWith(SignatureAlgorithm.HS256, securityProperties.secretKey)
            .setSubject(userId.toString())
            .setHeaderParam(Header.JWT_TYPE, jwtType)
            .setId(userId.toString())
            .setExpiration(Date(System.currentTimeMillis() + exp * 1000))
            .setIssuedAt(Date())
            .compact()
    }

}
