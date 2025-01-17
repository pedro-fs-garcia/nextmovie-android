package com.nextmovie.ui.navigation

import androidx.compose.material3.DrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nextmovie.ui.screens.publicScreens.LoginScreen
import com.nextmovie.ui.screens.publicScreens.WelcomeScreen
import kotlinx.coroutines.CoroutineScope

class NavGraph {
    @Composable
    fun ScreenNavigation(scope: CoroutineScope, drawerState: DrawerState, navController:NavHostController){
        val context = LocalContext.current
        NavHost(navController = navController, startDestination = "welcome"){

            composable("welcome"){
                WelcomeScreen().BuildPage(navController)
            }

            composable("login"){
                LoginScreen().BuildPage(navController)
            }


        }
    }
}