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
            startDestination = "HOME?word=Startup"
        ) {
            composable("HOME?word={word}",
                arguments = listOf(
                    navArgument("word") {
                        type=NavType.StringType
                        nullable=true
                    }
                )){
                Home(
                    navController = navController,
                )
            }
            composable(NavigationItem.TextFieldScreen.route) {
                TextFieldScreen(
                    navController = navController
                )
            }
            composable(NavigationItem.SampleVMScreen.route) {
                SampleVMScreen(
                    navController = navController
                )
            }
        }
    }
}