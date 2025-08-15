package com.example.chuberresumesample.ui.mainactivitycontents.apiexample

// Sample Call

//https://api.open-meteo.com/v1/forecast?latitude=47.6062&longitude=-122.3321&hourly=temperature_2m

// Required Arguments:
// 1. Location
        // ?latitude=(float)
        // &longitutde=(float)
// 1A. Location list & coordinates
        // Dallas: 32.78, -96.81
        // Honolulu: 21.31, -157.86
        // LA: 34.05, -118.24
        // Miami: 25.77, -80.19
        // New York: 40.71. -74.01
        // Philadelphia: 39.95, -75.16
        // San Fran: 37.77, -122.42
        // Seattle: 47.61, -122.33

// 2. Period of Data
        // &hourly={type}_{period},{type}_{period}, . . .
        // ex: &hourly=temperature_2m,relative_humidity_2m
        // &current={type}_period . .
        // ex" &current=temperature_2m
        // Options:
        // temperature, relative_humidity, apparent_temperature, is_day_or_night, precipitation, rain, showers, snowfall,
        // weather_code, cloud_cover_total, sealevel_pressure, surface_pressure
