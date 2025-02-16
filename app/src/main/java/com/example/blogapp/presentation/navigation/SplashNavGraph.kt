package com.example.blogapp.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.blogapp.presentation.ui.screens.splashScreen.SplashScreen


fun NavGraphBuilder.splashNavGraph(navController: NavController) {
    navigation(
        route = NavGraph.SPLASH,
        startDestination = SplashScreens.SplashScreen.route
    ) {
        composable(route = SplashScreens.SplashScreen.route) {
            SplashScreen(navController)
        }
    }
}

sealed class SplashScreens(val route: String) {
    data object SplashScreen : SplashScreens(route = "splash_screen")
}