package com.example.chatapp.presentation.authentication.login

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.chatapp.presentation.util.NavControllerHolder
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val navControllerHolder: NavControllerHolder
) : ViewModel() {

    var state: MutableState<LoginState> = mutableStateOf(LoginState())
        private set

    fun changeState(
        email: String? = null,
        password: String? = null
    ) {
        state.value = state.value.copy(
            email = email ?: state.value.email,
            password = password ?: state.value.password
        )
    }


}