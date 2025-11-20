package com.openknot.gateway.route

enum class RouteInfo(
    val uri: String,
    val path: String,
    val stripPrefix: Int = 0,
) {

    AUTH_SERVICE(
        uri = "http://openknot-auth-service:8081",
        path = "/auth/**",
        stripPrefix = 2,
    ),

    USER_SERVICE(
        uri = "http://openknot-user-service:8082",
        path = "/users/**",
        stripPrefix = 2,
    ),

}