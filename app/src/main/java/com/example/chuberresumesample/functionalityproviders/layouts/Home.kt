package com.example.chuberresumesample.functionalityproviders.layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.chuberresumesample.functionalityproviders.navigation.Screens
import androidx.compose.material3.Button
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

@Composable
fun Home(navController: NavController) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { navController.navigate(Screens.TEXTFIELDSCREEN.name)}) {
            Text("Go To Next Screen")
        }
        Spacer(modifier = Modifier.height(8.dp))
        navController.currentBackStackEntry?.arguments?.getString("word")?.let {
            Text(it)
        }
        Button(onClick = { navController.navigate(Screens.SAMPLEVMSCREEN.name)}) {
            Text("Go To VM Screen")
        }
    }
}