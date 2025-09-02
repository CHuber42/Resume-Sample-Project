package com.example.chuberresumesample.ui.mainactivitycontents.apiexample

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ApiResultScreen(
    navController: NavController
) {
    val msg = navController.previousBackStackEntry?.savedStateHandle?.get<String>("response")
    Column() {
        msg?.let{
            Text(it)
        }
    }
}