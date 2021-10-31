package br.com.jeancsanchez.sampleapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(MainUiState.Loading)
    val uiState: StateFlow<MainUiState> = _uiState

    fun doSomeTask() {
        _uiState.value = MainUiState.Loading
    }
}