package com.example.kotlinpractice.global.security.exception

import kotlinRepo.reporepo.global.error.exception.ErrorProperty

enum class SecurityErrorCode  (
    private val status: Int,
    private val message: String
) : ErrorProperty {

    EXPIRED_TOKEN(401 , "Expired Token"),
    INVALID_TOKEN(401, "Invalid Token");

    override fun status(): Int = status

    override fun message(): String = message

}