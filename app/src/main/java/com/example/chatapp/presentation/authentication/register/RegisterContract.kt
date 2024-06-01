package com.example.chatapp.presentation.authentication.register

/**
 * UI State that represents RegisterScreen
 **/
data class RegisterState(
    val email: String = "",
    val password: String = "",
    val password2: String = "",
    val name: String = "",
    var checkBoxSwitch: Boolean = false
)

/**
 * Register Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class RegisterActions(
    val onRegister: () -> Unit = {},
    val onEmailChange: (String) -> Unit = {},
    val onPasswordChange: (String) -> Unit = {},
    val onPassword2Change: (String) -> Unit = {},
    val onNameChange: (String) -> Unit = {},
    val onCheckBoxSwitchChange: (Boolean) -> Unit = {}
)

