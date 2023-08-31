package com.example.navigationbasicsinjetpackcompose.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.navigationbasicsinjetpackcompose.navigation.AUTHENTICATION_ROUTE
import com.example.navigationbasicsinjetpackcompose.navigation.Screen
import com.example.navigationbasicsinjetpackcompose.screens.LoginScreen
import com.example.navigationbasicsinjetpackcompose.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ) {
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
