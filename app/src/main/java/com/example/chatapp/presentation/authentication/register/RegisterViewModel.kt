package com.example.chatapp.presentation.authentication.register

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.chatapp.presentation.util.NavControllerHolder
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val navControllerHolder: NavControllerHolder
):ViewModel() {
    var state: MutableState<RegisterState> = mutableStateOf(RegisterState())
        private set

    fun changeState(
        email: String? = null,
        password: String? = null,
        password2: String? = null,
        name: String? = null,
        checkBoxSwitch: Boolean? = null
    ) {
        state.value = state.value.copy(
            email = email ?: state.value.email,
            password = password ?: state.value.password,
            password2 = password2 ?: state.value.password2,
            name = name ?: state.value.name,
            checkBoxSwitch = checkBoxSwitch ?: state.value.checkBoxSwitch
        )
    }
    fun validatePassword(password: String){

    }



}