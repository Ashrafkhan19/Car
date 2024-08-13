package com.example.cars.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.cars.screens.Screens

@Composable
fun NavigationRoot(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screens.LoginOrSignUp) {

        authGraph()
    }

}


private fun NavGraphBuilder.authGraph() {
    navigation<Screens.LoginOrSignUp>(startDestination = Screens.LoginOrSignUp) {

        composable<Screens.LoginOrSignUp> {

        }
    }
}


private fun NavGraphBuilder.homeGraph() {
    navigation<Screens.Home>(startDestination = Screens.Home) {

        composable<Screens.Home> {

        }

        composable<Screens.ArticleDetail> {

        }
    }
}