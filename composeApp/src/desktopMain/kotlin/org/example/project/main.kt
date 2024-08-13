package org.example.project

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(
            position = WindowPosition(
                1200.dp,
                700.dp
            ),
            size = DpSize(
                width = 300.dp,
                height = 180.dp
            )
        ),
        title = "Clock",
        undecorated = true,
        transparent = true,
        alwaysOnTop = true
    ) {
        App()
    }
}
