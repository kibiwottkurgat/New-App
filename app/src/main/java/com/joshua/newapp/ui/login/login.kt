package com.joshua.newapp.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Visibility
//import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.joshua.newapp.R

@Composable
fun LoginScreen(modifier: Modifier = Modifier, navController: NavHostController) {
    // Fixed: Added missing state variables
    var emailInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var isVisible by remember { mutableStateOf(false) }
    val buttonModifier = Modifier
        .fillMaxWidth()
        .height(50.dp)
    val pagePadding = 24.dp

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(pagePadding)
    ) {
        Text(
            text = "Login To Get Started",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 10.dp)
        )

        Spacer(Modifier.height(8.dp))

        // Email Input
        OutlinedTextField(
            value = emailInput,
            onValueChange = { emailInput = it },
            label = { Text("Email Address") },
            leadingIcon = {
                Icon(Icons.Outlined.Email, contentDescription = "Email Icon")
            },
            placeholder = { Text(text = "eg. jk@example.com") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        // Password Input
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.baseline_visibility_off_24),
                   contentDescription = "Email",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            },
            label = {
                Text(text = "Password")
            },
            visualTransformation = if (isVisible) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            trailingIcon = {
                IconButton(
                    onClick = { isVisible = !isVisible }
                ) {
                    if (isVisible) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.outline_visibility_off_24),
                            contentDescription = "Password"
                        )
                    } else {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.outline_visibility_off_24),
                            contentDescription = "Password"
                        )
                    }
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            singleLine = true
        )
        // Login Button
        Button(
            onClick = { /* Handle Login Logic */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Login", fontSize = 16.sp)
        }
        // Footer Links
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            TextButton(onClick = { /* Handle Forgot Password */ }) {
                Text(text = "Forgot Password?")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "No account?", color = MaterialTheme.colorScheme.onSurfaceVariant)
                TextButton(onClick = { /* Navigate to Signup */ }) {
                    Text(text = "Create New Account")
                }
            }
        }
    }
}