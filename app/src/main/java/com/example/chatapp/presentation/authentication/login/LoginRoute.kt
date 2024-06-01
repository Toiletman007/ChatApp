package com.example.chatapp.presentation.authentication.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.example.chatapp.presentation.util.NavControllerHolder

@Composable
fun LoginRoute(
    coordinator: LoginCoordinator = rememberLoginCoordinator(
        viewModel = LoginViewModel(
            navControllerHolder = NavControllerHolder()))
) {
    // State observing and declarations
    val uiState: LoginState by coordinator.screenStateFlow

    // UI Actions
    val actions = rememberLoginActions(coordinator)

    // UI Rendering
    LoginScreen(state = uiState, actions = actions)
}

@Composable
fun rememberLoginActions(coordinator: LoginCoordinator): LoginActions {
    return remember(coordinator) {
        LoginActions(
            // Define the login actions
            onEmailChange = { newEmail ->
                coordinator.onChangeEmail(email = newEmail)
            },
            onPasswordChange = {newPassword ->
                coordinator.onChangePassword(password = newPassword)
            },
        )
    }
}
