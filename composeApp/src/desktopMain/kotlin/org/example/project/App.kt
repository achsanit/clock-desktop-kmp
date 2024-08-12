package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kmp_desktop_first.composeapp.generated.resources.Res
import kmp_desktop_first.composeapp.generated.resources.compose_multiplatform
import kotlinx.coroutines.delay
import java.time.LocalTime
import java.time.format.DateTimeFormatter

@Composable
@Preview
fun App() {
    MaterialTheme {
        val formatter = DateTimeFormatter.ofPattern("HH:mm")
        var currentTime by remember { mutableStateOf("") }
        LaunchedEffect(currentTime) {
            while(true) {
                currentTime = LocalTime.now().format(formatter)
                delay(1_000)
            }
        }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                currentTime,
                color = Color.White,
                fontSize = 120.sp,
                fontWeight = FontWeight.Normal,
            )
        }
    }
}
