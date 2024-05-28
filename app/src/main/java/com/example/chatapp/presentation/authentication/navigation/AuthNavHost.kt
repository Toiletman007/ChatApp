package com.example.chatapp.presentation.authentication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chatapp.presentation.authentication.RegisterScreen
import com.example.chatapp.presentation.authentication.RegisterViewModel


@Composable
fun AuthNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = AuthNavConstant.Register.name) {
        composable(AuthNavConstant.Register.name) {
            val viewModel = hiltViewModel<RegisterViewModel>()
            val state = viewModel.state.value

            RegisterScreen(
                state = state,
                changeName = { viewModel.changeState(email = it) },
                changeEmail = { viewModel.changeState(email = it) },
                changePassword = { viewModel.changeState(password = it) },
                changePassword2 = { viewModel.changeState(password2 = it) },

                )

        }
    }

}