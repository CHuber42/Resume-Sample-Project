package com.example.chuberresumesample.functionalityproviders.api

import androidx.navigation.NavController
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

class ApiProvider {
    companion object {
        private val client = OkHttpClient()

        fun queryWeatherService(lati: String, longi: String) : String {
            val request = Request.Builder()
                .url("https://api.open-meteo.com/v1/forecast?latitude=$lati&longitude=$longi&hourly=temperature_2m,relative_humidity_2m&current=temperature_2m")
                .build()

            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) {
                    throw IOException("Unexpected Code $response")
                }
                for ((name, value) in response.headers) {
                    println("$name, $value")
                }
                return (response.body.string())
            }
        }
    }
}