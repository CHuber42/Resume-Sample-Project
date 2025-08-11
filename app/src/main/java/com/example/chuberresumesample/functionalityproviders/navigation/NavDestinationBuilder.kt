package com.example.chuberresumesample.functionalityproviders.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

class NavDestinationBuilder() {
    companion object {
        fun Home() : String {
            val base = Screens.HOME.name
            val firstArg = "?word={word}"
            return base + firstArg
        }
        fun TextFieldScreen() : String {
            val base = Screens.TEXTFIELDSCREEN.name
            return base
        }
        fun SampleVMScreen() : String {
            val base = Screens.SAMPLEVMSCREEN.name
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