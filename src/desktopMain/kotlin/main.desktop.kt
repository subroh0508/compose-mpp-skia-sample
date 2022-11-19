import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.singleWindowApplication

fun main() {
    singleWindowApplication(
        title = "Compose MPP Skia Sample",
    ) { SampleApp() }
}

@Preview
@Composable
fun SamplePreview() {
    SampleApp()
}
