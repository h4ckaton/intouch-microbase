package com.intouch.microbase.security

class JwtTokenBody(
        val userId: Long = -1,
        val deviceId: Long = -1,
        val exp: Long = -1,
        val roles: Array<String> = arrayOf()
)