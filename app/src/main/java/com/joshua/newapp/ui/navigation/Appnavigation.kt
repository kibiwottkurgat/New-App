package com.joshua.newapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joshua.newapp.ui.registration.RegistrationScreen


sealed class Screen(val route: String) {
    data object Login : Screen("login")
    data object Registration : Screen("registration")
    data object Home : Screen("home")
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(Screen.Login.route) {
            LoginScreen(
                onNavigateToRegister = {
                    navController.navigate(Screen.Registration.route)
                },
                onLoginSuccess = {
                    // Corrected the popUpTo logic to clear the backstack
                    navController.navigate(Screen.Home.route) {
                        popUpTo(Screen.Login.route) { inclusive = true }
                    }
                }
            )
        }

        composable(Screen.Registration.route) {
            RegistrationScreen(
                onBackToLogin = {
                    navController.popBackStack()
                }
            )
        }

        composable(Screen.Home.route) {
            HomeScreen()
        }
    }
}


@Composable
fun LoginScreen(onNavigateToRegister: () -> Unit, onLoginSuccess: () -> Unit) {

}

@Composable
fun HomeScreen() {

}