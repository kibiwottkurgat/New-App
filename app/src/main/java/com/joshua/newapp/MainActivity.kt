package com.joshua.newapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.joshua.newapp.ui.theme.NewAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // 1. Initialize the splash screen BEFORE super.onCreate
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)

        // Optional: Keep splash screen visible until data is loaded
        // splashScreen.setKeepOnScreenCondition { viewModel.isLoading.value }

        setContent {
            NewAppTheme {
                // Your main app content (e.g., AppNavigation)
            }
        }
    }

    private fun installSplashScreen() {
        TODO("Not yet implemented")
    }
}