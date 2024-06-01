package com.example.chatapp.presentation.authentication.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * Screen's coordinator which is responsible for handling actions from the UI layer
 * and one-shot actions based on the new UI state
 */
class LoginCoordinator(
    private val viewModel: LoginViewModel
) {
    val screenStateFlow = viewModel.state

    fun onChangeEmail(email: String){
        viewModel.changeState(email = email)
    }
    fun onChangePassword(password: String){
        viewModel.changeState(password = password)
    }
    fun onLogin() {
        // Login user
    }
}

@Composable
fun rememberLoginCoordinator(
    viewModel: LoginViewModel = hiltViewModel()
): LoginCoordinator {
    return remember(viewModel) {
        LoginCoordinator(viewModel, )
    }
}