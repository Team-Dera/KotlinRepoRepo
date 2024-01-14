package kotlinRepo.reporepo.global.filter

import com.fasterxml.jackson.databind.ObjectMapper
import kotlinRepo.reporepo.global.security.jwt.JwtParser
import org.springframework.security.config.annotation.SecurityConfigurerAdapter
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.DefaultSecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import org.springframework.stereotype.Component

@Component
class FilterConfig(
    private val jwtParser: JwtParser,
    private val objectMapper: ObjectMapper
): SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity>(){

    override fun configure(http: HttpSecurity) {
        http.addFilterBefore(JwtFilter(jwtParser), UsernamePasswordAuthenticationFilter::class.java)
        http.addFilterBefore(GlobalExceptionFilter(objectMapper), JwtFilter::class.java)
    }

}
