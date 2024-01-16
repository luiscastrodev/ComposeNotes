package note.ui

import note.domain.NoteModel

data class AddNoteState(
    val noteModel: NoteModel,
    val isLoading: Boolean,
    val isSuccess: Boolean,
    val isFailure: Boolean
)
