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
fun SecondScreen(
    navController: NavController,
    idString: String
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Second screen - $idString")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(Screen.ThirdScreen.route) }) {
            Text(text = "Go to third screen")
        }
    }
}