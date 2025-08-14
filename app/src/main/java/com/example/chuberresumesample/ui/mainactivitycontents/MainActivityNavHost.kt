package com.example.chuberresumesample.ui.mainactivitycontents

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chuberresumesample.functionalityproviders.navigation.NavDestinationArgsList
import com.example.chuberresumesample.functionalityproviders.navigation.NavDestinationBuilder
import com.example.chuberresumesample.functionalityproviders.navigation.NavRouteBuilder
import com.example.chuberresumesample.ui.mainactivitycontents.apiexample.ApiExampleScreen
import com.example.chuberresumesample.ui.mainactivitycontents.homescreen.HomeScreen
import com.example.chuberresumesample.ui.mainactivitycontents.textfieldexample.TextFieldScreen
import com.example.chuberresumesample.ui.mainactivitycontents.vmnavexample.VMNavExampleScreen
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
                arguments = NavDestinationArgsList.HomeScreenArgs()
            ){
                HomeScreen(
                    navController = navController,
                )
            }
            composable(
                NavDestinationBuilder.TextFieldScreen(),
                arguments = NavDestinationArgsList.TextFieldExampleScreenArgs()
            ) {
                TextFieldScreen(
                    navController = navController
                )
            }
            composable(
                NavDestinationBuilder.SampleVMScreen(),
                arguments = NavDestinationArgsList.VMNavExampleScreenArgs()
            ) {
                VMNavExampleScreen(
                    navController = navController
                )
            }
            composable(
                NavDestinationBuilder.ApiExampleScreen(),
                arguments = NavDestinationArgsList.ApiExampleScreenArgs()
            ) {
                ApiExampleScreen(
                    navController = navController
                )
            }
        }
    }
}