package kotlinRepo.reporepo.global.filter

import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import kotlinRepo.reporepo.global.security.jwt.JwtParser
import kotlinRepo.reporepo.global.security.jwt.JwtProperties
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.OncePerRequestFilter


class JwtFilter(
    private val jwtParser: JwtParser
) : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val token = resolveToken(request)

        SecurityContextHolder.clearContext()
        token?.let {
            SecurityContextHolder.getContext().authentication = jwtParser.getAuthentication(token)
        }

        filterChain.doFilter(request, response)
    }

    private fun resolveToken(request: HttpServletRequest): String? =
        request.getHeader(JwtProperties.HEADER)?.also {
            if (it.startsWith(JwtProperties.PREFIX)) {
                return it.substring(JwtProperties.PREFIX.length)
            }
        }

}
