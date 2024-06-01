package com.example.chatapp.presentation.authentication.register

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.presentation.authentication.components.EmailTextField
import com.example.chatapp.presentation.authentication.components.NameTextField
import com.example.chatapp.presentation.authentication.components.PasswordTextField


@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    state: RegisterState,
    actions: RegisterActions,
) {
        val context = LocalContext.current

        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
        ) {
            Text(text = "Register", fontSize = 70.sp)
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                NameTextField(name =  state.name) { actions.onNameChange(it) }
                EmailTextField(email = state.email) { actions.onEmailChange(it) }

                PasswordTextField(value = state.password, text = "Password") { actions.onPasswordChange(it) }
                PasswordTextField(value = state.password2, text = "Confirm Password") { actions.onPassword2Change(it) }

                Row(verticalAlignment = Alignment.CenterVertically) {

                    RadioButton(
                        selected = state.checkBoxSwitch,
                        onClick = { actions.onCheckBoxSwitchChange(state.checkBoxSwitch) },
                    )
                    TextButton(onClick = {  }) {
                        Text(text = "I agree to the terms of service")
                    }


                }

                Button(modifier = Modifier, shape = RoundedCornerShape(14.dp), onClick = {
                    actions.onRegister()
                }) {
                    Text(text = "Register")
                    Spacer(modifier = modifier.width(10.dp))
                    Icon(imageVector = Icons.Outlined.CheckCircle, contentDescription = "Done")
                }
            }
        }
    }
//
//@Composable
//@Preview(name = "Register")
//private fun RegisterScreenPreview() {
//    RegisterScreen(
//        modifier = Modifier,
//        state = RegisterState(),
//        actions = RegisterActions()
//    )
//}
