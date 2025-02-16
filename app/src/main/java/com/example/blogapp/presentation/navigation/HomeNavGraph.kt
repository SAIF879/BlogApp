
package com.example.blogapp.presentation.navigation
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation



fun NavGraphBuilder.homeNavGraph(navController: NavController){
    navigation(
        route = NavGraph.HOME,
        startDestination = HomeScreens.HomeListScreen.route
    ){

        composable(route = HomeScreens.HomeListScreen.route) {

        }

    }
}

sealed class HomeScreens(val route : String){
    data object HomeListScreen : HomeScreens(route = "home_list_screen")

}