package com.example.cars.screens

sealed class Screens {
    data object LoginOrSignUp : Screens()
    data object Home : Screens()
    data object ArticleDetail : Screens()
}
