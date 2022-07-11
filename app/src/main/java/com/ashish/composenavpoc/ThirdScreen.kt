package com.ashish.composenavpoc

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ThirdScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Third screen")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            navController.navigate(Screen.SecondScreen.route + "/{id}") {
                popUpTo(Screen.FirstScreen.route)
            }
        }) {
            Text(text = "Pop up first screen with inclusive false")
        }

        Button(onClick = {
            navController.navigate(Screen.SecondScreen.route + "/{id}") {
                popUpTo(Screen.FirstScreen.route) {
                    inclusive = true
                }
            }
        }) {
            Text(text = "Pop up first screen with inclusive true")
        }
    }

}