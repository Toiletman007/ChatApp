package com.example.chatapp.presentation.authentication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.presentation.authentication.components.EmailTextField
import com.example.chatapp.presentation.authentication.components.PasswordTextField

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    state: LoginState,
    actions: LoginActions,
) {
    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.6f)
    ) {
        Text(text = "Login", fontSize = 70.sp)
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            EmailTextField(email = state.email) { actions.onEmailChange(it) }
            Spacer(modifier = Modifier.height(15.dp))
            PasswordTextField(value = state.password, text = "Password", color = false) { actions.onPasswordChange(it) }

            Spacer(modifier = Modifier.height(20.dp))
            Button(modifier = Modifier, shape = RoundedCornerShape(14.dp), onClick = {  }) {

                Text(text = "Login")
                Spacer(modifier = modifier.width(15.dp))
                Icon(imageVector = Icons.Outlined.CheckCircle, contentDescription = "Done")

            }

        }
    }
}


@Composable
@Preview(name = "Login")
private fun LoginScreenPreview() {
    LoginScreen(
        state = LoginState(),
        actions = LoginActions(),
        modifier = Modifier
    )
}
