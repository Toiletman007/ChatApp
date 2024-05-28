package com.example.chatapp.presentation.authentication.components

import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NameTextField(modifier: Modifier = Modifier, name: String, onValueChange: (String) -> Unit) {
    OutlinedTextField(
        modifier = Modifier.width(360.dp),
        value = name,
        onValueChange = {
            if (it.length <= 20) {
                onValueChange(it)
            }
        },
        label = { Text("Name") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Outlined.AccountBox,
                contentDescription = null
            )
        },
        singleLine = true,
    )
}