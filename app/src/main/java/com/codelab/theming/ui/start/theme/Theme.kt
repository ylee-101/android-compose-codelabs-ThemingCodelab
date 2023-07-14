package com.codelab.theming.ui.start.theme

import JetnewsShapes
import Red700
import Red800
import Red900
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColors(
    primary = Red700,
    primaryVariant = Red900,
    onPrimary = Color.White,
    secondary = Red700,
    secondaryVariant = Red900,
    onSecondary = Color.White,
    error = Red800
)

@Composable
fun JetnewsTheme(content : @Composable () -> Unit ) {
    MaterialTheme(
        typography = JetnewsTypography,
        shapes = JetnewsShapes,
        colors = LightColors,
        content = content
    )
}