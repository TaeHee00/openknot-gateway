package com.openknot.gateway.util

import com.openknot.gateway.config.TokenProperties
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.io.Decoders
import io.jsonwebtoken.security.Keys
import org.springframework.stereotype.Component

@Component
class TokenUtil(
    private val tokenProperties: TokenProperties,
) {

    private val secretKey by lazy {
        Keys.hmacShaKeyFor(Decoders.BASE64.decode(tokenProperties.secret))
    }

    fun getAuthentication(token: String): String? {
        val claims = Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).payload
        val userId = claims.subject

        return userId
    }
}