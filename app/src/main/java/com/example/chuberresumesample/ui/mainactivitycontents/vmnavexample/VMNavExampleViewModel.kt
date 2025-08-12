package com.example.chuberresumesample.ui.mainactivitycontents.vmnavexample

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class VMNavExampleViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(VMNavExampleUIState())
    val uiState: StateFlow<VMNavExampleUIState> = _uiState.asStateFlow()

    private var beginningWord: String = "Beginning"

    init {
        _uiState.value = VMNavExampleUIState(sampleText = beginningWord)
    }

    fun setUserWord(word: String) {
        _uiState.update { currentState ->
            currentState.copy(sampleText = word)
        }
    }
}