package com.example.cars.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.cars.auth.AuthScreen
import com.example.cars.home.ArticleDetailScreen
import com.example.cars.home.HomeScreen
import com.example.cars.screens.Screens

@Composable
fun NavigationRoot(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screens.LoginOrSignUp) {

        composable<Screens.Home> {
            HomeScreen(onItemClick = {
                navController.navigate(Screens.ArticleDetail)
            })
        }

        composable<Screens.ArticleDetail> {
            ArticleDetailScreen(onBack = {
                navController.navigateUp()
            })
        }

        composable<Screens.LoginOrSignUp> {
            AuthScreen(
                onLoginClick = {
                navController.navigate(Screens.Home)
            }, onSignUpClick = {
                    navController.navigate(Screens.Home)
            })
        }

    }

}


