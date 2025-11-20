package com.openknot.gateway.route

enum class RouteInfo(
    val uri: String,
    val path: String,
    val stripPrefix: Int = 0,
) {

    AUTH_SERVICE(
        uri = "http://127.0.0.1:8081",
        path = "/auth/**",
        stripPrefix = 2,
    ),

    USER_SERVICE(
        uri = "http://127.0.0.1:8082",
        path = "/users/**",
        stripPrefix = 2,
    ),

}