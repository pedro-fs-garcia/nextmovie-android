package com.nextmovie.ui.screens.publicScreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nextmovie.ui.components.PublicScreenComponents
import com.nextmovie.ui.theme.NextMovieTheme

class LoginScreen {

    private var publicScreenComponents = PublicScreenComponents()

    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var validLogin by mutableStateOf(false)

    @Composable
    fun BuildPage(navController: NavController, modifier:Modifier = Modifier){
        Column (
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ){
            publicScreenComponents.MainAppTitle()
            TextField(
                value = email,
                onValueChange = {email = it},
                modifier = modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            TextField(
                value = password,
                onValueChange = {password = it},
                modifier = modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            Button(
                onClick = {
                    if (validLogin){
                        navController.navigate("dashboard")
                    }
                },
                modifier = modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ){
                Text(text = "login")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    NextMovieTheme {
        val navController = rememberNavController()
        LoginScreen().BuildPage(navController)
    }
}