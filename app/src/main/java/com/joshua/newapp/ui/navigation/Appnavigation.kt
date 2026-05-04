package com.joshua.newapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.joshua.newapp.ui.login.LoginScreen
import com.joshua.newapp.ui.navigation.ROUTES
import com.joshua.newapp.ui.onboarding.OnboardingScreen

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier){
    NavHost(
        navController = navController,
        startDestination = ROUTES.Onboarding.name
    ) {
        composable (ROUTES.Onboarding.name){ OnboardingScreen(navController) }
        composable (ROUTES.Login.name){ LoginScreen(navController, modifier) }
    }
}