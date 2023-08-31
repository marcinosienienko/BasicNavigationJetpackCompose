package com.example.navigationbasicsinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationbasicsinjetpackcompose.navigation.nav_graph.SetupNavGraph
import com.example.navigationbasicsinjetpackcompose.components.NavigationBasicsInJetpackComposeTheme

class MainActivity : ComponentActivity() {

    lateinit var navController : NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationBasicsInJetpackComposeTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}
