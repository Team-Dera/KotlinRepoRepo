package com.study.kotlkotlin.global.security.exception

import com.example.kotlinpractice.global.security.exception.SecurityErrorCode
import kotlinRepo.reporepo.global.error.exception.BusinessException

class InvalidTokenException private constructor() : BusinessException(SecurityErrorCode.INVALID_TOKEN) {

    companion object {
        @JvmField
        val EXCEPTION = InvalidTokenException()
    }
}