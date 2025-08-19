package com.example.chuberresumesample.ui.mainactivitycontents.apiexample

data class ApiExampleUIState(
    val city: CityLocation?,
    val latitude: String,
    val longitude: String,
    val latitudeValid: Boolean,
    val longitudeValid: Boolean
)