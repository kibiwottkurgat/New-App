package com.joshua.newapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class HomeState(
    val isLoading: Boolean = true,
    val userName: String = "User",
    val items: List<String> = emptyList(),
    val errorMessage: String? = null
)
class HomeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HomeState())
    val uiState: StateFlow<HomeState> = _uiState.asStateFlow()
    init {
        loadDashboardData()
    }
    private fun loadDashboardData() {
        viewModelScope.launch {
            // Simulate a network delay
            _uiState.value = _uiState.value.copy(isLoading = true)

            delay(2000) // 2 second delay

            // Update state with dummy data
            _uiState.value = _uiState.value.copy(
                isLoading = false,
                userName = "Joshua",
                items = listOf("Update Profile", "Logout", "Settings", "Help")
            )
        }
    }

    fun refreshData() {
        loadDashboardData()
    }
}