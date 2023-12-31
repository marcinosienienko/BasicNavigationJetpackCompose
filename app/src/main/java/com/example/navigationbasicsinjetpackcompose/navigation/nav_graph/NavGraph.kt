package com.example.navigationbasicsinjetpackcompose.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigationbasicsinjetpackcompose.navigation.HOME_ROUTE
import com.example.navigationbasicsinjetpackcompose.navigation.ROOT_ROUTE
import com.example.navigationbasicsinjetpackcompose.navigation.Screen

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ){
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)

    }
}