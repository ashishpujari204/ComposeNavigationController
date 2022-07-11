package com.ashish.composenavpoc

sealed class Screen(
    val route: String
) {
    object FirstScreen : Screen("first_screen")
    object SecondScreen : Screen("second_screen")
    object ThirdScreen : Screen("third_screen")
}
