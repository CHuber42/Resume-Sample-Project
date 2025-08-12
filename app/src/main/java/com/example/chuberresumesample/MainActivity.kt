package com.example.chuberresumesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.chuberresumesample.ui.mainactivitycontents.MainActivityNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainActivityNavHost()
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ChuberresumesampleTheme {
//        Greeting("Android")
//    }
//}