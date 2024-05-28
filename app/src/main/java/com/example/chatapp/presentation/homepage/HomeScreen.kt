package com.example.chatapp.presentation.homepage

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.firebase.auth.FirebaseUser

@Composable
fun HomeScreen(modifier: Modifier = Modifier, currentUser: FirebaseUser?) {
    Text(text = "HomeScreen")
}