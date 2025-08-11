package com.example.chuberresumesample.functionalityproviders.navigation

enum class Screens {
    HOME,
    TEXTFIELDSCREEN,
    SAMPLEVMSCREEN
}

sealed class NavigationItem(val route: String) {
    object Home: NavigationItem(Screens.HOME.name)
    object TextFieldScreen: NavigationItem(Screens.TEXTFIELDSCREEN.name)
    object SampleVMScreen: NavigationItem(Screens.SAMPLEVMSCREEN.name)
}

class NavRouteBuilder() {
    companion object {
        fun Home(textBoxWord: String?) : String {
            val base = Screens.HOME.name
            val firstArg : String = "?word=" + (textBoxWord ?: "null")
            return base + firstArg
        }
        fun TextFieldScreen() : String {
            val base = Screens.TEXTFIELDSCREEN.name
            return base
        }
        fun SampleVMScreen() : String {
            val base = Screens.TEXTFIELDSCREEN.name
            return base
        }
    }
}