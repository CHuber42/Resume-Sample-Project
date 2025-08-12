package com.example.chuberresumesample.functionalityproviders.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

// To be used when declaring destinations in NavHosts and NavGraphs
// NOT to be used in navigation.navigate {} blocks

class NavDestinationBuilder() {
    companion object {
        fun Home() : String {
            val base = ScreenBaseNames.HOMESCREEN.name
            val firstArg = "?word={word}"
            return base + firstArg
        }
        fun TextFieldScreen() : String {
            val base = ScreenBaseNames.TEXTFIELDEXAMPLESCREEN.name
            return base
        }
        fun SampleVMScreen() : String {
            val base = ScreenBaseNames.VMNAVEXAMPLESCREEN.name
            return base
        }
        fun ApiExampleScreen() : String {
            val base = ScreenBaseNames.APIEXAMPLESCREEN.name
            return base
        }
    }
}

class NavDestinationArgsList() {
    companion object {
        fun HomeScreenArgs() : List<NamedNavArgument> {
            val firstArg = navArgument("word") {
                type = NavType.StringType
                nullable = true
            }
            return listOf(firstArg)
        }
        fun VMNavExampleScreenArgs() : List<NamedNavArgument> {
            return listOf()
        }
        fun TextFieldExampleScreenArgs() : List<NamedNavArgument> {
            return listOf()
        }
        fun ApiExampleScreenArgs() : List<NamedNavArgument> {
            return listOf()
        }
    }
}