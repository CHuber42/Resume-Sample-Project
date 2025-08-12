package com.example.chuberresumesample.functionalityproviders.layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.material3.Button
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import com.example.chuberresumesample.functionalityproviders.navigation.NavRouteBuilder

@Composable
fun Home(navController: NavController) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { navController.navigate(NavRouteBuilder.ToTextFieldScreen())}) {
            Text("Go To TextField Screen")
        }
        Spacer(modifier = Modifier.height(8.dp))
        navController.currentBackStackEntry?.arguments?.getString("word")?.let {
            Text(it)
        }
        Button(onClick = { navController.navigate(NavRouteBuilder.ToSampleVMScreen())}) {
            Text("Go To VM Screen")
        }
    }
}