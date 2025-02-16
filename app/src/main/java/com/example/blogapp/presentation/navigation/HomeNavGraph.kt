
package com.example.blogapp.presentation.navigation
import android.net.Uri
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.blogapp.presentation.ui.screens.homeScreen.HomeScreen
import com.example.blogapp.presentation.ui.screens.homeScreen.HomeScreenEvents
import com.example.blogapp.presentation.ui.screens.homeScreen.HomeViewModel
import com.example.blogapp.presentation.ui.screens.webviewScreen.WebViewScreen


fun NavGraphBuilder.homeNavGraph(navController: NavController){
    navigation(
        route = NavGraph.HOME,
        startDestination = HomeScreens.HomeListScreen.route
    ){

        composable(route = HomeScreens.HomeListScreen.route) {
            val  viewmodel : HomeViewModel = hiltViewModel()
            val blogList by viewmodel.blogList.collectAsState()
                HomeScreen(blogList = blogList ){
                    when(it){
                        is HomeScreenEvents.OnNavigate -> {
                            navController.navigate(HomeScreens.WebViewScreen.route + "/${Uri.encode(it.link)}")

                        }
                    }
                }
        }
        composable(route = HomeScreens.WebViewScreen.route+"/{link}",
            arguments = listOf(navArgument("link") { type = NavType.StringType }))
        {backStackEntry->
            val webViewLink = backStackEntry.arguments?.getString("link")?.let { Uri.decode(it) }

            if (webViewLink != null) {
                WebViewScreen(webViewLink)
            }
        }

    }
}

sealed class HomeScreens(val route : String){
    data object HomeListScreen : HomeScreens(route = "home_list_screen")
    data object WebViewScreen : HomeScreens(route = "web_view_screen")
}