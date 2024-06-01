package com.example.chatapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chatapp.presentation.authentication.login.LoginCoordinator
import com.example.chatapp.presentation.authentication.login.LoginScreen
import com.example.chatapp.presentation.authentication.login.LoginViewModel
import com.example.chatapp.presentation.authentication.login.rememberLoginActions
import com.example.chatapp.presentation.authentication.register.RegisterCoordinator
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
                actions = rememberRegisterActions(coordinator = RegisterCoordinator(viewModel))
            )
        }
        composable(route = MainNavConstant.Login.name) {
            val viewModel = hiltViewModel<LoginViewModel>()
            val state = viewModel.state.value
            LoginScreen(
                state = state,
                actions = rememberLoginActions(coordinator = LoginCoordinator(viewModel = viewModel))
            )
        }
        composable(route = MainNavConstant.Home.name){
//            HomeScreen(currentUser = )
        }
    }
}