package com.example.chuberresumesample.functionalityproviders.navigation

enum class Screens {
    HOME,
    TEXTFIELDSCREEN,
    SAMPLEVMSCREEN
}

class NavRouteBuilder() {
    companion object {
        fun ToHome(textBoxWord: String?) : String {
            val base = Screens.HOME.name
            val firstArg : String = "?word=" + (textBoxWord ?: "null")
            return base + firstArg
        }
        fun ToTextFieldScreen() : String {
            val base = Screens.TEXTFIELDSCREEN.name
            return base
        }
        fun ToSampleVMScreen() : String {
            val base = Screens.SAMPLEVMSCREEN.name
            return base
        }
    }
}