package com.example.navigationbasicsinjetpackcompose

const val DETAIL_ARGUMENT_KEY = "id"
sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}"){
       fun passId(id: Int): String {
           return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
       }
    }

}

