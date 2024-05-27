package com.example.chatapp.Presentation.authentication

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import javax.inject.Inject

@HiltViewModel
class AuthenticationViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {


}

annotation class HiltViewModel
