package com.openknot.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenknotGatewayApplication

fun main(args: Array<String>) {
    runApplication<OpenknotGatewayApplication>(*args)
}
