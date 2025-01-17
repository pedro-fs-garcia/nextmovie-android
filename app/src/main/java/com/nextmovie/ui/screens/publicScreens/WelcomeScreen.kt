package com.nextmovie.ui.screens.publicScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nextmovie.BuildPage
import com.nextmovie.R
import com.nextmovie.ui.components.PublicScreenComponents
import com.nextmovie.ui.theme.NextMovieTheme

class WelcomeScreen {

    private var publicScreenComponents = PublicScreenComponents()

    @Composable
    fun BuildPage(navController: NavController, modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            publicScreenComponents.MainAppTitle()
            Text(
                text = stringResource(R.string.welcome_message),
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
            Column{
                Button(
                    onClick = { navController.navigate(("login")) },
                    modifier = modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text(
                        text = stringResource(R.string.get_started),
                        fontSize = 16.sp
                    )
                }
                Spacer(modifier.height(16.dp))
                Button(
                    onClick = { navController.navigate(("contribute")) },
                    modifier = modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text(
                        text = stringResource(R.string.contribute_on_github),
                        fontSize = 16.sp
                    )
                }
                Spacer(modifier.height(16.dp))
                Button(
                    onClick = { navController.navigate(("aboutUs")) },
                    modifier = modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text(
                        text = stringResource(R.string.about_us),
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePreview() {
    NextMovieTheme {
        val navController = rememberNavController()
        WelcomeScreen().BuildPage(navController)
    }
}