package com.example.chatapp.Presentation.authentication.components

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.chatapp.Presentation.ui.theme.DarkGreen

@Composable
fun PasswordTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit
) {
    var passwordVisible by rememberSaveable { mutableStateOf(false) }
    val gradientColors = listOf(
        Color.Red,
        Color.Yellow,
        Color.Green,
        Color.Green,
        DarkGreen,
        DarkGreen,
        DarkGreen,
    )
    val brush = Brush.linearGradient(
        colors =
            if (passwordVisible) {
                listOf(Color.Black, Color.Black)
            } else {
                gradientColors
            }

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
        visualTransformation = if (passwordVisible) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        textStyle = TextStyle(brush = brush),
        singleLine = true,
        trailingIcon = {
            if (passwordVisible) {
                IconButton(onClick = { passwordVisible = false }) {
                    Icon(
                        imageVector = Icons.Filled.Visibility,
                        contentDescription = "Show Password",
                    )
                }
            } else {
                IconButton(onClick = { passwordVisible = true }) {
                    Icon(
                        imageVector = Icons.Filled.VisibilityOff,
                        contentDescription = "Hide Password",
                    )
                }
            }
        }
    )
}