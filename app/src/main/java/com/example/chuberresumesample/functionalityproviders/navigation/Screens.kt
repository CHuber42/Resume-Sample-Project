package com.example.chuberresumesample.functionalityproviders.navigation

enum class Screens {
    HOME,
    TEXTFIELDSCREEN,
}
sealed class NavigationItem(val route: String) {
    object Home: NavigationItem(Screens.HOME.name)
    object TextFieldScreen: NavigationItem(Screens.TEXTFIELDSCREEN.name)
}