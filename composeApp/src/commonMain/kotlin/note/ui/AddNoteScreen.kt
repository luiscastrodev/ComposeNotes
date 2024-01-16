import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen


object AddNoteScreen : Screen {
    @Composable
    override fun Content() {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .safeDrawingPadding()
        ) {
            AddNoteScreenContent()
        }
    }
}

@Composable
private fun AddNoteScreenContent(
    modifier: Modifier = Modifier,
) {

    var title by remember {
        mutableStateOf("")
    }

    var description by remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(18.dp),
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        TextField(
            value = title,
            onValueChange = { title = it },
            label = {
                Text(
                    text = "Title"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
        )

        TextField(
            value = description,
            onValueChange = { description = it },
            label = {
                Text(
                    text = "Description"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
        )

//        if (state.isLoading)
//            CircularProgressIndicator()
//        else
//            Button(
//                onClick = {
//                    val note = NoteModel(
//                        id = "",
//                        title = title,
//                        description = description,
//                    )
//                    onEvent(AddNoteEvent.AddNote(note = note))
//                }
//            ) {
//                Text(
//                    text = "Add note"
//                )
//            }
    }
}

