package com.example.chatapp.presentation.authentication

import android.util.Log
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.presentation.authentication.components.EmailTextField
import com.example.chatapp.presentation.authentication.components.NameTextField
import com.example.chatapp.presentation.authentication.components.PasswordTextField
@Preview
@Composable
fun LoginScreen (modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val radioButtonSwitch by remember { mutableStateOf(false) }
    var email by remember { mutableStateOf("") }



    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.6f)
    ) {
        Text(text = "Login", fontSize = 70.sp)
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            NameTextField(name = name) { name = it }
            EmailTextField(email = email) { email = it }
            Spacer(modifier = Modifier.height(15.dp))
            PasswordTextField(value = password, text = "Password", color = false){ password = it }

            Spacer(modifier = Modifier.height(20.dp))
            Button(modifier = Modifier, shape = RoundedCornerShape(14.dp)
                ,onClick = { if (radioButtonSwitch){
                    //register account
                    Log.d("RegisterScreen: ", "Yes ")
                    Log.d("Register Password", password)
                }else{
                    //Don't
                    Log.d("RegisterScreen: ", "No ")
                }
                }) {
                Text(text = "Login")
                Spacer(modifier = modifier.width(15.dp))
                Icon(imageVector = Icons.Outlined.CheckCircle, contentDescription = "Done")

            }

        }
    }
}