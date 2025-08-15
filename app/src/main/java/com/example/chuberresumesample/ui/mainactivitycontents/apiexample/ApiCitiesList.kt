package com.example.chuberresumesample.ui.mainactivitycontents.apiexample

val listOfCities = listOf(
    CityLocation.Dallas,
    CityLocation.Honolulu,
    CityLocation.LosAngeles,
    CityLocation.Miami,
    CityLocation.NewYork,
    CityLocation.Philadelphia,
    CityLocation.SanFrancisco,
    CityLocation.Seattle
)

sealed class CityLocation(
    val name: String,
    val latitude: String,
    val longitude: String) {
    object Dallas: CityLocation(
        "Dallas",
        "32.78",
        "-96.81"
    )
    object Honolulu: CityLocation(
        "Honolulu",
        "21.31",
        "-157.86"
    )
    object LosAngeles: CityLocation(
        "Los Angeles",
        "34.05",
        "-118.24"
    )
    object Miami: CityLocation(
        "Miami",
        "25.77",
        "-80.19"
    )
    object NewYork: CityLocation(
        "New York",
        "40.71",
        "-74.01"
    )
    object Philadelphia: CityLocation(
        "Philadelphia",
        "39.95",
        "-75.16"
    )
    object SanFrancisco: CityLocation(
        "San Francisco",
        "37.77",
        "-122.42"
    )
    object Seattle: CityLocation(
        "Seattle",
        "47.16",
        "-122.33"
    )
}