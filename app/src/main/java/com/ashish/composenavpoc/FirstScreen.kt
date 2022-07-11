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
fun FirstScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "First screen")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(Screen.SecondScreen.route + "/20") }) {
            Text(text = "Go to second screen")
        }
    }
}