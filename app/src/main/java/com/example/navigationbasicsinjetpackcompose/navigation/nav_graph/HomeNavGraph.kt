package com.example.navigationbasicsinjetpackcompose.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.navigationbasicsinjetpackcompose.navigation.DETAIL_ARGUMENT_KEY
import com.example.navigationbasicsinjetpackcompose.navigation.DETAIL_ARGUMENT_KEY2
import com.example.navigationbasicsinjetpackcompose.navigation.HOME_ROUTE
import com.example.navigationbasicsinjetpackcompose.navigation.Screen
import com.example.navigationbasicsinjetpackcompose.screens.DetailScreen
import com.example.navigationbasicsinjetpackcompose.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ){
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                    defaultValue = "Stevdza-San"
                }
            )
        ) {
            DetailScreen(navController = navController)
        }
    }
}