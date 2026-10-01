package com.example.fundaciontextilcircular.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = Turquesa,
    onPrimary = Negro,
    secondary = Amarillo,
    onSecondary = Negro,
    tertiary = Negro,
    onTertiary = Blanco,
    background = Blanco,
    onBackground = Negro,
    surface = Blanco,
    onSurface = Negro,
    surfaceVariant = GrisClaro,
    onSurfaceVariant = Negro,
)

private val DarkColorScheme = darkColorScheme(
    primary = Turquesa,
    onPrimary = Negro,
    secondary = Amarillo,
    onSecondary = Negro,
    tertiary = Blanco,
    onTertiary = Negro,
    background = Negro,
    onBackground = Blanco,
    surface = Negro,
    onSurface = Blanco,
    surfaceVariant = GrisOscuro,
    onSurfaceVariant = Blanco,
)

@Composable
fun FundacionTextilCircularTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    // Sin color dinámico a propósito: con él, en Android 12+ los colores salen del fondo
    // de pantalla del teléfono y no de la marca de la fundación.
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content,
    )
}
