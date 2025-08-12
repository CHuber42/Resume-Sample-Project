package com.example.chuberresumesample.functionalityproviders.layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.chuberresumesample.functionalityproviders.navigation.NavRouteBuilder
import com.example.chuberresumesample.ui.viewmodels.SampleViewModel

@Composable
fun SampleVMScreen(
    sampleViewModel: SampleViewModel = viewModel(),
    navController: NavController)
{
    val uiState by sampleViewModel.uiState.collectAsState()

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = uiState.sampleText,
            onValueChange = { sampleViewModel.setUserWord(it)},
        )
        Spacer(Modifier.height(8.dp))
        Text(
            uiState.sampleText
        )
        Button(onClick = {
            navController.navigate(NavRouteBuilder.ToHome("From VM Screen"))}) {
            Text(text = "To Home Screen")
        }
    }
}