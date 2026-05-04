package com.joshua.newapp.ui.forgotpassword

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ForgotPasswordScreen(
    onNavigateBack: () -> Unit = {}
) {
    // State management for the text field
    var email by rememberSaveable { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        // 1. Lottie Animation Placeholder
        // Make sure you have the Lottie dependency and your JSON file in res/raw
        LottieAnimationWidget()

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Forgot Password?",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "Enter your email address to receive a reset link.",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 2. Email Input
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter your Email") },
            placeholder = { Text("example@gmail.com") },
            singleLine = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon"
                )
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 3. Submit Button
        Button(
            onClick = { /* Handle reset logic here */ },
            modifier = Modifier.fillMaxWidth(),
            shape = MaterialTheme.shapes.medium
        ) {
            Text(text = "Send Reset Link")
        }

        // 4. Navigation Buttons
        TextButton(onClick = onNavigateBack) {
            Text(text = "Back to Login")
        }
    }
}

@Composable
fun LottieAnimationWidget() {
    Box(modifier = Modifier.size(200.dp), contentAlignment = Alignment.Center) {
        Text("Animation Here")
    }
}