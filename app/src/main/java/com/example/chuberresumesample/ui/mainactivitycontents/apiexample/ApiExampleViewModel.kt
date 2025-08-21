package com.example.chuberresumesample.ui.mainactivitycontents.apiexample

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ApiExampleViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(ApiExampleUIState(
        null,
        "",
        "",
        false,
        false)
    )
    val uiState: StateFlow<ApiExampleUIState> = _uiState.asStateFlow()

    fun setLatitude(latitude: String) {
        _uiState.update { currentState ->
            currentState.copy(
                latitude = latitude,
                latitudeValid = isLatitudeValid(latitude)
            )
        }
    }
    fun setLongitude(longitude: String) {
        _uiState.update { currentState ->
            currentState.copy(
                longitude = longitude,
                longitudeValid = isLongitudeValid(longitude)
            )
        }
    }
    fun onCitySelected(city: CityLocation) {
        _uiState.update { currentState ->
            currentState.copy(
                city = city,
                latitude = city.latitude,
                longitude = city.longitude,
                latitudeValid = isLatitudeValid(city.latitude),
                longitudeValid = isLongitudeValid(city.longitude))
        }
    }
    fun isLatitudeValid(num: String) : Boolean {
        try {
            val latFloat = num.toFloat()
            if (-90F <= latFloat && latFloat <= 90F) {
                return true
            } else {
                return false
            }
        } catch (e: NumberFormatException) {
            return false
        }
    }
    fun isLongitudeValid(num: String) : Boolean {
        try {
            val lonFloat = num.toFloat()
            if (-180F <= lonFloat && lonFloat <= 180F) {
                return true
            } else {
                return false
            }
        } catch (e: NumberFormatException) {
            return false
        }
    }
}