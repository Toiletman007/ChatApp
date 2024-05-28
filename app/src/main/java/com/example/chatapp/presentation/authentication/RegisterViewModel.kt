package com.example.chatapp.presentation.authentication

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(

) : ViewModel() {
    var state: MutableState<RegisterState> = mutableStateOf(RegisterState())
        private set

    fun changeState(
        email: String? = null,
        password: String? = null,
        password2: String? = null,
        name: String? = null
    ) {
        state.value = state.value.copy(
            email = email ?: state.value.email,
            password = password ?: state.value.password,
            password2 = password2 ?: state.value.password2,
            name = name ?: state.value.name
        )
    }


}

data class RegisterState(
    val email: String = "",
    val password: String = "",
    val password2: String = "",
    val name: String = ""
)