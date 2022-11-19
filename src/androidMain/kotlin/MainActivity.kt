package net.subroh0508.composemppskia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import SampleApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SampleApp()
        }
    }
}