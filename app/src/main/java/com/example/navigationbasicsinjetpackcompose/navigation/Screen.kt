package com.example.navigationbasicsinjetpackcompose.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"
sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}"){
       fun passId(id: Int): String {
           return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
       }
    }
    object Login: Screen(route = "Login_screen")

    object SignUp: Screen(route = "SignUp_screen")

}

