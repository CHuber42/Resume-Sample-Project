package com.example.chuberresumesample.functionalityproviders.navigation

// Not to be used while declaring "composable" within a NavHost. See: NavDestinationBuilder.
// DO use within navigation.navigate {} blocks.

class NavRouteBuilder() {
    companion object {
        fun ToHome(textBoxWord: String?) : String {
            val base = ScreenBaseNames.HOMESCREEN.name
            val firstArg : String = "?word=" + (textBoxWord ?: "null")
            return base + firstArg
        }
        fun ToTextFieldScreen() : String {
            val base = ScreenBaseNames.TEXTFIELDEXAMPLESCREEN.name
            return base
        }
        fun ToSampleVMScreen() : String {
            val base = ScreenBaseNames.VMNAVEXAMPLESCREEN.name
            return base
        }
        fun ToApiExampleScreen() : String {
            val base = ScreenBaseNames.APIEXAMPLESCREEN.name
            return base
        }
        fun ToApiResultScreen() : String {
            val base = ScreenBaseNames.APIRESULTSCREEN.name
            return base
        }
    }
}