package com.example.chuberresumesample.functionalityproviders.navigation

enum class Screens {

}

class NavRouteBuilder() {
    companion object {
        fun ToHome(textBoxWord: String?) : String {
            val base = ScreenBaseNames.HOME.name
            val firstArg : String = "?word=" + (textBoxWord ?: "null")
            return base + firstArg
        }
        fun ToTextFieldScreen() : String {
            val base = ScreenBaseNames.TEXTFIELDSCREEN.name
            return base
        }
        fun ToSampleVMScreen() : String {
            val base = ScreenBaseNames.SAMPLEVMSCREEN.name
            return base
        }
    }
}