package com.example.chatapp.presentation.authentication.register

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.example.chatapp.presentation.util.NavControllerHolder

@Composable
fun RegisterRoute(
    coordinator: RegisterCoordinator = rememberRegisterCoordinator(viewModel = RegisterViewModel(navControllerHolder = NavControllerHolder()))
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow

    // UI Actions
    val actions = rememberRegisterActions()

    // UI Rendering
    RegisterScreen(state = uiState, actions = actions)
}


@Composable
fun rememberRegisterActions(): RegisterActions {
    return remember() {
        RegisterActions(

        )
    }
}