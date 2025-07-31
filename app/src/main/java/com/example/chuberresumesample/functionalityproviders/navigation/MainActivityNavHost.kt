package com.example.chuberresumesample.functionalityproviders.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chuberresumesample.functionalityproviders.layouts.Home
import com.example.chuberresumesample.functionalityproviders.layouts.Login
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
            composable(NavigationItem.Login.route) {
                Login(
                    navController = navController
                )
            }
        }
    }
}