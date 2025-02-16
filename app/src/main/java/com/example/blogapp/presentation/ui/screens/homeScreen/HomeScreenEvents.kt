package com.example.blogapp.presentation.ui.screens.homeScreen

sealed class HomeScreenEvents {
    data class OnNavigate(val link: String?) : HomeScreenEvents()
}