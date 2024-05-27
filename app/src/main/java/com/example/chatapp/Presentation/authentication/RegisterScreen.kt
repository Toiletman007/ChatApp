package com.example.chatapp.Presentation.authentication

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapp.Presentation.authentication.components.PasswordTextField

@Composable
fun RegisterScreen(modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var password2 by remember { mutableStateOf("") }
    var radioButtonSwitch by remember { mutableStateOf(false) }




    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.6f)
    ) {
        Text(text = "Register", fontSize = 70.sp)
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            OutlinedTextField(
                value = name,
                onValueChange = {
                    if (it.length <= 20) {
                        name = it
                    }
                },
                label = { Text("Name") },
            )
            Spacer(modifier = Modifier.height(10.dp))

            PasswordTextField(value = password){ password = it }
            PasswordTextField(value = password2){ password2 = it }

            Row(verticalAlignment = Alignment.CenterVertically) {

                RadioButton(selected = radioButtonSwitch, onClick = { radioButtonSwitch = !radioButtonSwitch })
                TextButton(onClick = { Log.d("TERMS OF SERVICE", "Open") }) {
                    Text(text = "I agree to the terms of service")
                }


            }

            Button(modifier = Modifier, shape = RoundedCornerShape(14.dp)
                ,onClick = { if (radioButtonSwitch){
                //register account
                Log.d("RegisterScreen: ", "Yes ")
                Log.d("Register Password", password)
                Log.d("Register Password", password2)
            }else{
                //Don't
                Log.d("RegisterScreen: ", "No ")
            }
            }) {
                Text(text = "Register")
                Spacer(modifier = modifier.width(10.dp))
                Icon(imageVector = Icons.Outlined.CheckCircle, contentDescription = "Done")

            }

        }


    }
}