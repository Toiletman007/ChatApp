package com.example.chatapp.presentation.authentication.register

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.example.chatapp.presentation.util.NavControllerHolder

@Composable
fun RegisterRoute(
    coordinator: RegisterCoordinator =
        rememberRegisterCoordinator(
            viewModel = RegisterViewModel(
                navControllerHolder = NavControllerHolder()))
) {
    // State observing and declarations
    val uiState: RegisterState by coordinator.screenStateFlow

    // UI Actions
    val actions = rememberRegisterActions(coordinator)

    // UI Rendering
    RegisterScreen(state = uiState, actions = actions)
}


@Composable
fun rememberRegisterActions(coordinator: RegisterCoordinator): RegisterActions {
    return remember(coordinator) {
        RegisterActions(
            onRegister = {
                         Log.d("Test2", "Register acc")
//                Validate data and register account
            },
            onNameChange = { newName ->
                coordinator.onChangeName(name = newName)
            },
            onEmailChange = { newEmail ->
                coordinator.onChangeEmail(email = newEmail)
            },
            onPasswordChange = {newPassword ->
                coordinator.onChangePassword(password = newPassword)
            },
            onPassword2Change = {newPassword2 ->
                coordinator.onChangePassword2(password2 = newPassword2)
            },
            onCheckBoxSwitchChange = {newCheckBoxSwitchState ->
                coordinator.onCheckBoxSwitchChange(checkBoxState = newCheckBoxSwitchState)
            }



        )
    }
}