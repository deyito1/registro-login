package com.yasir.compose.androidinterviewchallenge.domain.model

data class Login(
    val userId: Int? = null,
    val email: String = "",
    val password: String = "",
    val token: String = "",
)
