package com.example.tarjetapresentacion.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = darkColorScheme(
    primary = Color(0xFF2E7D32),
    background = Color(0xFFD0E8D0)
)

@Composable
fun TarjetaPresentacionTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}
