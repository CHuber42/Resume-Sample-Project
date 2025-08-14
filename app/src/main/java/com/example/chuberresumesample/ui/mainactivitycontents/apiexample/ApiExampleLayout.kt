package com.example.chuberresumesample.ui.mainactivitycontents.apiexample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.chuberresumesample.ui.mainactivitycontents.vmnavexample.VMNavExampleViewModel
import androidx.compose.material3.Text
import com.example.chuberresumesample.functionalityproviders.navigation.NavRouteBuilder

@Composable
fun ApiExampleScreen(
    apiExampleViewModel: VMNavExampleViewModel = viewModel(),
    navController: NavController
) {
    val uiState by apiExampleViewModel.uiState.collectAsState()

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "This is the Api Screen"
        )
        Button( onClick =
            { navController.navigate(NavRouteBuilder.ToHome("From Api Screen")) }
        ) {
            Text("To Home Screen")
        }
    }
}