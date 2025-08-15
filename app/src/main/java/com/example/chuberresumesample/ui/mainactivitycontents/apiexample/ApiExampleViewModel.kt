package com.example.chuberresumesample.ui.mainactivitycontents.apiexample

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ApiExampleViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(ApiExampleUIState(null, "", ""))
    val uiState: StateFlow<ApiExampleUIState> = _uiState.asStateFlow()

    fun setLatitude(latitude: String) {
        _uiState.update { currentState ->
            currentState.copy(latitude = latitude)
        }
    }
    fun setLongitude(longitude: String) {
        _uiState.update { currentState ->
            currentState.copy(longitude = longitude)
        }
    }
    fun onCitySelected(city: CityLocation) {
        _uiState.update { currentState ->
            currentState.copy(city = city, latitude = city.latitude, longitude = city.longitude)
        }
    }
    fun tryParseFloat(num: String) {

    }
}