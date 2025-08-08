package com.example.chuberresumesample.ui.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SampleViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(SampleUiState())
    val uiState: StateFlow<SampleUiState> = _uiState.asStateFlow()

    private var beginningWord: String = "Beginning"

    init {
        _uiState.value = SampleUiState(sampleText = beginningWord)
    }

    fun setUserWord(word: String) {
        _uiState.update { currentState ->
            currentState.copy(sampleText = word)
        }
    }
}