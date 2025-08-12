package com.example.chuberresumesample.functionalityproviders.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.chuberresumesample.functionalityproviders.layouts.Home
import com.example.chuberresumesample.functionalityproviders.layouts.SampleVMScreen
import com.example.chuberresumesample.functionalityproviders.layouts.TextFieldScreen
import com.example.chuberresumesample.ui.theme.ChuberresumesampleTheme

@Composable
fun MainActivityNavHost() {
    ChuberresumesampleTheme {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = NavRouteBuilder.ToHome("Startup")
        ) {
            composable(
                NavDestinationBuilder.Home(),
                arguments = NavDestinationArgsList.HomeArgs()
            ){
                Home(
                    navController = navController,
                )
            }
            composable(
                NavDestinationBuilder.TextFieldScreen(),
                arguments = NavDestinationArgsList.TextFieldScreenArgs()
            ) {
                TextFieldScreen(
                    navController = navController
                )
            }
            composable(
                NavDestinationBuilder.SampleVMScreen(),
                arguments = NavDestinationArgsList.SampleVMScreenArgs()
            ) {
                SampleVMScreen(
                    navController = navController
                )
            }
        }
    }
}