package com.tam.uvo.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.tam.uvo.Notification.presentation.NotificationScreen
import com.tam.uvo.home.presentation.HomeScreen
import com.tam.uvo.login.presentation.LoginScreen
import com.tam.uvo.login.presentation.RegisterScreen
import com.tam.uvo.profile.presentation.ProfileScreen
import com.tam.uvo.report.presentation.ReportScreen
import com.tam.uvo.space.presentation.SpaceScreen

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Scaffold(
        bottomBar = {
            if (currentDestination?.route !in listOf("login", "register")) {
                NavigationBar(
                    modifier = Modifier
                        .height(68.dp),
                    containerColor = Color.White,
                    contentColor = Color.Transparent

                ) {

                    list.forEach { navItem ->
                        NavigationBarItem(
                            modifier = Modifier
                                .padding(bottom = 13.dp)
                                .background(Color.Transparent),
                            selected = false,
                            onClick = {
                                navController.navigate(navItem.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                            icon = {
                                Icon(
                                    modifier = Modifier
                                        .size(28.dp),
                                    imageVector = navItem.icon,
                                    contentDescription = null,
                                    tint = Color.Black
                                )
                            }
                        )
                    }
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "login",
            modifier = Modifier
                .padding(paddingValues)
        ) {
            composable("login") { LoginScreen(navController) }
            composable("register") { RegisterScreen(navController) }
            composable(route = Screens.HomeScreen.name) {
                HomeScreen()
            }
            composable(route = Screens.SpaceScreen.name) {
                SpaceScreen()
            }
            composable(route = Screens.ReportScreen.name) {
                ReportScreen()
            }
            composable(route = Screens.NotificationScreen.name) {
                NotificationScreen()
            }
            composable(route = Screens.ProfileScreen.name) {
                ProfileScreen(navController)
            }
        }
    }
}