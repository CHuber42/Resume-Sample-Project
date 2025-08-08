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