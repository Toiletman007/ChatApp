package com.example.chatapp.presentation.authentication.register

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * Screen's coordinator which is responsible for handling actions from the UI layer
 * and one-shot actions based on the new UI state
 */
class RegisterCoordinator(
    private val viewModel: RegisterViewModel,
) {
    val screenStateFlow = viewModel.state

    fun doStuff() {
        // TODO Handle UI Action

    }

}

@Composable
fun rememberRegisterCoordinator(
    viewModel: RegisterViewModel = hiltViewModel(),
): RegisterCoordinator {
    return remember(viewModel) {
        RegisterCoordinator(viewModel, )
    }
}