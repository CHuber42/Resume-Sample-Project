package com.example.chuberresumesample.ui.mainactivitycontents.apiexample

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ApiExampleViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(ApiExampleUIState())
    val uiState: StateFlow<ApiExampleUIState> = _uiState.asStateFlow()

    init {

    }
}