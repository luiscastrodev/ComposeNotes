package note.data.local

import note.domain.NoteModel

data class NoteDTO(
    val id: String,
    val title: String,
    val description: String
){
    fun toModel() = NoteModel(
        id = id,
        title = title,
        description = description
    )

    companion object{
        fun fromModel(noteModel: NoteModel)= NoteDTO(
            id = noteModel.id,
            title = noteModel.title,
            description = noteModel.description
        )
    }
}