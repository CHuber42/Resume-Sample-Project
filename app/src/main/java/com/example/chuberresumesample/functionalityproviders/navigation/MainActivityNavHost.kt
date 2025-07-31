package com.example.chuberresumesample.functionalityproviders.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chuberresumesample.functionalityproviders.layouts.Home
import com.example.chuberresumesample.functionalityproviders.layouts.TextFieldScreen
import com.example.chuberresumesample.ui.theme.ChuberresumesampleTheme

@Composable
fun CreateMainActivityNavHost() {
    ChuberresumesampleTheme {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = NavigationItem.Home.route
        ) {
            composable(NavigationItem.Home.route) {
                Home(
                    navController = navController
                )
            }
            composable(NavigationItem.TextFieldScreen.route) {
                TextFieldScreen(
                    navController = navController
                )
            }
        }
    }
}