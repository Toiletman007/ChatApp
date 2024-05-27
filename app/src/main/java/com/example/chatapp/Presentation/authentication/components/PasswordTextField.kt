package com.example.chatapp.Presentation.authentication.components

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun PasswordTextField(modifier: Modifier = Modifier, value:String, onValueChange: (String) -> Unit) {

    val gradientColors = listOf(
        Color.Red,
        Color.Yellow,
        Color.Green,
        Color.Cyan,
        Color.Blue,
        Color.Magenta
    )
    val brush = Brush.linearGradient(
        colors = gradientColors
    )
    OutlinedTextField(
        modifier = Modifier.width(280.dp),
        value = value,
        onValueChange = {
            if (it.length <= 106) {
                onValueChange(it)
            }
        },
        label = { Text("Password") },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        textStyle = TextStyle(brush = brush)
    )
}