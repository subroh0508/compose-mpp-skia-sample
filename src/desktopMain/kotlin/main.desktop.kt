import androidx.compose.material.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() {
    application {
        Window(
            onCloseRequest = {},
            title = "Compose MPP Skia Sample",
        ) { Text("Hello, World!") }
    }
}
