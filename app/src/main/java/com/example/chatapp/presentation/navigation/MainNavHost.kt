package com.example.chatapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chatapp.presentation.authentication.LoginScreen
import com.example.chatapp.presentation.authentication.register.RegisterScreen
import com.example.chatapp.presentation.authentication.register.RegisterViewModel
import com.example.chatapp.presentation.authentication.register.rememberRegisterActions

@Composable
fun MainNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = MainNavConstant.Login.name) {

        composable(route = MainNavConstant.Register.name) {
            val viewModel = hiltViewModel<RegisterViewModel>()
            val state = viewModel.state.value
            RegisterScreen(
                state = state,
                actions = rememberRegisterActions()
            )
        }
        composable(route = MainNavConstant.Login.name) {
            LoginScreen(
                modifier = Modifier
            )
        }


    }
}