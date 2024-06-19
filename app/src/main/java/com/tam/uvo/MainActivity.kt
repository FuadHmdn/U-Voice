package com.tam.uvo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.tam.uvo.login.presentation.LoginScreen
import com.tam.uvo.navigation.AppNavigation
import com.tam.uvo.ui.theme.UVOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT,
            )
        )
        super.onCreate(savedInstanceState)
        setContent {
            UVOTheme {
                AppNavigation()
            }
        }
    }
}