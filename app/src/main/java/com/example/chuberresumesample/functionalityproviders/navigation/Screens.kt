package com.example.chuberresumesample.functionalityproviders.navigation

enum class Screens {
    HOME,
    LOGIN,
}
sealed class NavigationItem(val route: String) {
    object Home: NavigationItem(Screens.HOME.name)
    object Login: NavigationItem(Screens.LOGIN.name)
}