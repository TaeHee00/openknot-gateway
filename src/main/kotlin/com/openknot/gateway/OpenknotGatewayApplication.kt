package com.openknot.gateway

import com.openknot.gateway.config.TokenProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@EnableConfigurationProperties(TokenProperties::class)
@SpringBootApplication
class OpenknotGatewayApplication

fun main(args: Array<String>) {
    runApplication<OpenknotGatewayApplication>(*args)
}
