package com.example.chuberresumesample.ui.mainactivitycontents.apiexample

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chuberresumesample.functionalityproviders.navigation.NavRouteBuilder

@Composable
fun ApiExampleScreen(
    apiExampleViewModel: ApiExampleViewModel = viewModel(),
    navController: NavController
) {
    val uiState by apiExampleViewModel.uiState.collectAsState()

    Column(
        Modifier
            .fillMaxSize()
            .statusBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            "This is the Api Screen",
        )
        Spacer(Modifier.height(32.dp))
        Text(
            "Select a City",
        )
        CityDropdownMenu(
            apiExampleViewModel,
            uiState
        )
        Text(
            "OR\n Enter a Latitude and Longitude",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        CoordinateBoxes(
            apiExampleViewModel,
            uiState
        )
        Spacer(Modifier.height(12.dp))
        Button(
            onClick = { },
            enabled = (uiState.longitudeValid && uiState.latitudeValid)
        ) {
            Text("Submit Query")
        }
        Spacer(Modifier.weight(0.1F))
        Button( onClick =
            { navController.navigate(NavRouteBuilder.ToHome("From Api Screen")) },
            Modifier.padding(vertical = 8.dp)
        ) {
            Text("To Home Screen")
        }
    }
}

@Composable
fun CityDropdownMenu(apiExampleViewModel: ApiExampleViewModel, uiState: ApiExampleUIState) {
    var expanded by remember { mutableStateOf(false) }
    val listOfCities = listOfCities
    OutlinedCard(
        modifier = Modifier.clickable { expanded = !expanded }
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = uiState.city?.name ?: "",
                Modifier.padding(horizontal = 12.dp)
            )
            Icon(Icons.Outlined.ArrowDropDown, null, modifier = Modifier.padding(8.dp))
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            listOfCities.forEach { city ->
                DropdownMenuItem(
                    text = { Text(city.name) },
                    onClick = {
                        apiExampleViewModel.onCitySelected(city)
                        expanded = false
                    }
                )
            }
        }
    }
}

@Composable
fun CoordinateBoxes(apiExampleViewModel: ApiExampleViewModel, uiState: ApiExampleUIState) {
    val textFieldWeight = 0.1F
    Spacer(Modifier.height(16.dp))
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        TextField(
            value = uiState.latitude,
            modifier = Modifier.padding(horizontal = 32.dp).weight(textFieldWeight),
            onValueChange = { apiExampleViewModel.setLatitude(it)},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            label = { Text("Latitude") }
        )
        TextField(
            value = uiState.longitude,
            modifier = Modifier.padding(horizontal = 32.dp).weight(textFieldWeight),
            onValueChange = { apiExampleViewModel.setLongitude(it)},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            label = { Text("Longitude") }
        )
    }
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        val errorTextStlye = TextStyle(
            textAlign = TextAlign.Center,
            color = Color.Red,
            fontStyle = FontStyle.Italic,
            fontSize = 16.sp
        )
        Text(
            text = if (uiState.latitudeValid) "" else "Latitude is Invalid",
            style = errorTextStlye,
            modifier = Modifier
                .weight(0.5F)
        )
        Text(
            text = if (uiState.longitudeValid) "" else "Longitude is Invalid",
            style = errorTextStlye,
            modifier = Modifier
                .weight(0.5F)
        )
    }
}