package com.example.cars.screens

import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer

@Serializable
sealed class Screens {
    @Serializable
    data object LoginOrSignUp : Screens()
    data object Auth : Screens()
    @Serializable
    data object Home : Screens()
    @Serializable
    data object ArticleDetail : Screens()
}
