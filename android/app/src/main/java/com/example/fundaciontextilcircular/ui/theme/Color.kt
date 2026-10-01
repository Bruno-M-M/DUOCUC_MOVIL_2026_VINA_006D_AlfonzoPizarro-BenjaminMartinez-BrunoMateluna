package com.example.fundaciontextilcircular.ui.theme

import androidx.compose.ui.graphics.Color

// Paleta de la Fundación Textil Circular (valores tomados del CSS de textilcircular.cl)
val Turquesa = Color(0xFF05C9CD)
val Amarillo = Color(0xFFFFDF01)
val Negro = Color(0xFF000000)
val Blanco = Color(0xFFFFFFFF)
val GrisClaro = Color(0xFFF4F4F4)
val GrisOscuro = Color(0xFF1C1C1C)

// Contraste (WCAG): turquesa y amarillo con texto NEGRO dan 10:1 y 15:1.
// Con texto BLANCO dan 2:1 y 1.3:1, que no se lee. Por eso onPrimary y onSecondary son negros.
