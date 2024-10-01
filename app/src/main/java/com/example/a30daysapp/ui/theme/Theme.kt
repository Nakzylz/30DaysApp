package com.example.a30daysapp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColors = lightColorScheme(
    primary = PrimaryColor,
    secondary = SecondaryColor,
    tertiary = TertiaryColor
)

private val DarkColors = darkColorScheme(
    primary = PrimaryDark,
    secondary = SecondaryDark,
    tertiary = TertiaryDark
)

@Composable
fun _30DaysAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(), // or darkColorScheme() for dark theme
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

/*private val CustomTypography = Typography(
    titleLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    // Customize other typography elements...
)

@Composable
fun TipsAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = CustomTypography,
        content = content
    )
}*/
