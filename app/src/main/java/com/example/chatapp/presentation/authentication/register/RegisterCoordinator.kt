package com.example.chatapp.presentation.authentication.register

import android.util.Log
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
    fun onRegister(){
        Log.d("Sel", "TEST@!@$@!#$@#%R@#$%#!$%#!$%!#@$")
    }
    fun onChangeName(name: String){
        viewModel.changeState(name = name)
    }
    fun onChangeEmail(email: String){
        viewModel.changeState(email = email)
    }
    fun onChangePassword(password: String){
        viewModel.changeState(password = password)
    }
    fun onChangePassword2(password2: String){
        viewModel.changeState(password2 = password2)
    }
    fun onCheckBoxSwitchChange(checkBoxState: Boolean){
        viewModel.changeState(checkBoxSwitch = !checkBoxState)
    }
//    fun changeState(): (String?) -> Unit = { viewModel.changeState("SUSAKIFSODG")
//    }

}

@Composable
fun rememberRegisterCoordinator(
    viewModel: RegisterViewModel = hiltViewModel(),
): RegisterCoordinator {
    return remember(viewModel) {
        RegisterCoordinator(viewModel, )



    }


}