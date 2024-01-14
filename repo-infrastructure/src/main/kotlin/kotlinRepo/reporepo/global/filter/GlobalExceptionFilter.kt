package kotlinRepo.reporepo.global.filter

import com.fasterxml.jackson.databind.ObjectMapper
import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import kotlinRepo.reporepo.global.error.dto.ErrorResponse
import kotlinRepo.reporepo.global.error.exception.BusinessException
import kotlinRepo.reporepo.global.error.exception.ErrorProperty
import org.springframework.web.filter.OncePerRequestFilter

class GlobalExceptionFilter(
    private val objectMapper: ObjectMapper
) : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        try {
            filterChain.doFilter(request, response)
        } catch (e: BusinessException) {
            val errorCode: ErrorProperty = e.errorProperty
            response.status = errorCode.status()
            response.contentType = "application/json"
            response.characterEncoding = "UTF-8"
            val errorResponse: ErrorResponse = ErrorResponse.of(errorCode)
            objectMapper.writeValue(response.writer, errorResponse)
        }
    }
}