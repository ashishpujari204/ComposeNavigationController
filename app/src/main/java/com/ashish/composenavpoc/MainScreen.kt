package com.ashish.composenavpoc

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.FirstScreen.route
    ) {
        composable(Screen.FirstScreen.route) {
            FirstScreen(navController = navController)
        }
        composable(Screen.SecondScreen.route + "/{id}") { navBackStack ->
            val id = navBackStack.arguments?.getString("id")?:"NA"
            SecondScreen(navController = navController, idString = id)
        }
        composable(Screen.ThirdScreen.route) {
            ThirdScreen(navController = navController)
        }
    }
}