package com.example.chatapp.presentation.authentication.login

/**
 * UI State that represents LoginScreen
 **/
data class LoginState(
    val email: String = "",
    val password: String = "",
)

/**
 * Login Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class LoginActions(
    val onLogin: () -> Unit = {},
    val onEmailChange: (String) -> Unit = {},
    val onPasswordChange: (String) -> Unit = {},
)


