package com.example.cars.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.cars.R

// Set of Material typography styles to start with
val baseline = Typography(
//    bodyLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)


// Strawford Font Family
val Strawford = FontFamily(
    Font(R.font.strawford_black, FontWeight.Black),
    Font(R.font.strawford_bold, FontWeight.Bold),
    Font(R.font.strawford_extralight, FontWeight.ExtraLight),
    Font(R.font.strawford_light, FontWeight.Light),
    Font(R.font.strawford_medium, FontWeight.Medium),
    Font(R.font.strawford_regular, FontWeight.Normal),
    Font(R.font.strawford_thin, FontWeight.Thin)
)



// Scilla Font Family
val Scilla = FontFamily(
    Font(R.font.scilla_regular, FontWeight.Normal),
    Font(R.font.scilla_narrow_regular_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.scilla_narrow_regular, FontWeight.Normal),
    Font(R.font.scilla_narrow_regular_italic, FontWeight.Normal, FontStyle.Italic)
)


val AppTypography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = Strawford),
    displayMedium = baseline.displayMedium.copy(fontFamily = Strawford),
    displaySmall = baseline.displaySmall.copy(fontFamily = Strawford),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = Strawford),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = Strawford),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = Strawford),
    titleLarge = baseline.titleLarge.copy(fontFamily = Scilla),
    titleMedium = baseline.titleMedium.copy(fontFamily = Scilla),
    titleSmall = baseline.titleSmall.copy(fontFamily = Scilla),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = Scilla),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = Scilla),
    bodySmall = baseline.bodySmall.copy(fontFamily = Scilla),
    labelLarge = baseline.labelLarge.copy(fontFamily = Scilla),
    labelMedium = baseline.labelMedium.copy(fontFamily = Scilla),
    labelSmall = baseline.labelSmall.copy(fontFamily = Scilla),
)