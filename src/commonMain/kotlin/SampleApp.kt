import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SampleApp() {
    MaterialTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text("Compose MPP Skia Sample") }
                    )
                }
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Row {
                        Text("Today is a rainy day.", modifier = Modifier.weight(1F))
                        Icon(Icons.Filled.Warning, "warning")
                    }
                    Row {
                        Text("Tomorrow is a sunny day.", modifier = Modifier.weight(1F))
                        Icon(Icons.Filled.Info, "info")
                    }
                }
            }
        }
    }
}