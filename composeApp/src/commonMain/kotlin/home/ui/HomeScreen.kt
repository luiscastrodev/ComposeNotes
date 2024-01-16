package home.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen

@OptIn(ExperimentalMaterial3Api::class)
object HomeScreen : Screen {

    @Composable
    override fun Content() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "Notes App"
                        )
                    },
                    actions = {
                        IconButton(
                            onClick = {

                            }
                        ) {

                        }
                    }
                )
            },
            modifier = Modifier
                .fillMaxSize()
                .safeDrawingPadding()
        ) {

        }
    }
}