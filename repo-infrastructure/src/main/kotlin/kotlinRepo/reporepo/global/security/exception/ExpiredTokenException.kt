package com.example.kotlinpractice.global.security.exception

import kotlinRepo.reporepo.global.error.ErrorCode
import kotlinRepo.reporepo.global.error.exception.BusinessException


class ExpiredTokenException private constructor() : BusinessException(ErrorCode.EXPIRED_TOKEN) {

    companion object {
        @JvmField
        val EXCEPTION = ExpiredTokenException()
    }
}