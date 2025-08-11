package com.example.chuberresumesample.functionalityproviders.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

// To be used when declaring destinations in NavHosts and NavGraphs
// NOT to be used in navigation.navigate {} blocks

class NavDestinationBuilder() {
    companion object {
        fun Home() : String {
            val base = ScreenBaseNames.HOME.name
            val firstArg = "?word={word}"
            return base + firstArg
        }
        fun TextFieldScreen() : String {
            val base = ScreenBaseNames.TEXTFIELDSCREEN.name
            return base
        }
        fun SampleVMScreen() : String {
            val base = ScreenBaseNames.SAMPLEVMSCREEN.name
            return base
        }
    }
}

class NavDestinationArgsList() {
    companion object {
        fun HomeArgs() : List<NamedNavArgument> {
            val firstArg = navArgument("word") {
                type = NavType.StringType
                nullable = true
            }
            return listOf(firstArg)
        }
        fun SampleVMScreenArgs() : List<NamedNavArgument> {
            return listOf()
        }
        fun TextFieldScreenArgs() : List<NamedNavArgument> {
            return listOf()
        }
    }
}