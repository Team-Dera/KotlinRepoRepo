package com.example.kotlinpractice.global.security

import com.fasterxml.jackson.databind.ObjectMapper
import com.example.kotlinpractice.global.error.GlobalExceptionFilter
import kotlinRepo.reporepo.global.security.jwt.JwtFilter
import com.example.kotlinpractice.global.security.jwt.JwtTokenProvider
import org.springframework.security.config.annotation.SecurityConfigurerAdapter
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.DefaultSecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter

class FilterConfig(
        private val jwtTokenProvider: JwtTokenProvider,
        private val objectMapper: ObjectMapper
): SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity>(){

    @Override
    public override fun configure(http: HttpSecurity) {

        http
            .addFilterBefore(JwtFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter::class.java)
            .addFilterBefore(GlobalExceptionFilter(objectMapper), JwtFilter::class.java)
    }

}
