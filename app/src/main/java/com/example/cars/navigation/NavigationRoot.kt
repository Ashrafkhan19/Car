package com.example.cars.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
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

        composable<Screens.Home>(
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { it }, // Slide in from the left
                    animationSpec = tween(durationMillis = 300)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -it }, // Slide out to the right
                    animationSpec = tween(durationMillis = 300)
                )
            },
            popEnterTransition = {
                slideInHorizontally(
                    initialOffsetX = { -it }, // Slide in from the right
                    animationSpec = tween(durationMillis = 300)
                )
            },
            popExitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { it }, // Slide out to the right
                    animationSpec = tween(durationMillis = 300)
                )
            }
        ) {
            HomeScreen(onItemClick = {
                navController.navigate(Screens.ArticleDetail)
            })
        }

        composable<Screens.ArticleDetail>(
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { it }, // Slide in from the left
                    animationSpec = tween(durationMillis = 300)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -it }, // Slide out to the right
                    animationSpec = tween(durationMillis = 300)
                )
            },
            popEnterTransition = {
                slideInHorizontally(
                    initialOffsetX = { -it }, // Slide in from the right
                    animationSpec = tween(durationMillis = 300)
                )
            },
            popExitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { it }, // Slide out to the right
                    animationSpec = tween(durationMillis = 300)
                )
            }
        ) {
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


