package com.example.navigationbasicsinjetpackcompose.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.navigationbasicsinjetpackcompose.screens.DetailScreen
import com.example.navigationbasicsinjetpackcompose.screens.HomeScreen
import com.example.navigationbasicsinjetpackcompose.screens.LoginScreen
import com.example.navigationbasicsinjetpackcompose.screens.SignUpScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY){
                type = NavType.IntType
            },
            //navArgument(DETAIL_ARGUMENT_KEY2)
            )
        ) {
            Log.d("Arguments", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            DetailScreen(navController = navController)
        }
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}