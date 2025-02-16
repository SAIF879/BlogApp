
package com.example.blogapp.presentation.navigation
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.blogapp.presentation.ui.screens.homeScreen.HomeScreen
import com.example.blogapp.presentation.ui.screens.homeScreen.HomeViewModel


fun NavGraphBuilder.homeNavGraph(navController: NavController){
    navigation(
        route = NavGraph.HOME,
        startDestination = HomeScreens.HomeListScreen.route
    ){

        composable(route = HomeScreens.HomeListScreen.route) {
            val  viewmodel : HomeViewModel = hiltViewModel()
            val blogList by viewmodel.blogList.collectAsState()
                HomeScreen(blogList = blogList)
        }

    }
}

sealed class HomeScreens(val route : String){
    data object HomeListScreen : HomeScreens(route = "home_list_screen")

}