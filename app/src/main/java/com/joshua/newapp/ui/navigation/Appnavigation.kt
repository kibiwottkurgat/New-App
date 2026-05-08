package com.joshua.newapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.joshua.newapp.ui.forgotpassword.ForgotPasswordScreen
import com.joshua.newapp.ui.login.LoginScreen
import com.joshua.newapp.ui.signup.SignUpScreen
import com.joshua.newapp.ui.registration.RegistrationScreen


@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier
){
    NavHost(
        navController = navController,
        startDestination = ROUTES.Register.name
    ){
        composable(ROUTES.Login.name) { LoginScreen( navController= navController,modifier = modifier) }
        composable(ROUTES.Register.name) { RegisterScreen( navController= navController,modifier = modifier) }
        composable(ROUTES.ForgotPassword.name) { ForgotPasswordScreen( navController= navController,modifier = modifier) }
        composable(ROUTES.Signup.name) { SignUpScreen( navController= navController,modifier = modifier) }
    }
}

@Composable
fun RegisterScreen(navController: NavHostController, modifier: Modifier) {
    TODO("implemented")
}