package com.joshua.newapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.joshua.newapp.ui.login.LoginScreen
import com.joshua.newapp.ui.theme.NewAppTheme
import com.joshua.newapp.ui.signup.SignUpScreen



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewAppTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(modifier = Modifier.padding(innerPadding),)
                }
            }
        }
    }
}
//class MainActivity2 : ComponentActivity () {
//override fun
//
//@Preview(showBackground = true)
//@Composable
//fun LoginPreview() {
//    NewAppTheme {
//
//    }
//}

//class MainActivity2 : ComponentActivity () {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            NewAppTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    SignUpScreen( Modifier = Modifier.padding(innerPadding))
//                }
//
//            }
//        }
//    }
//}
