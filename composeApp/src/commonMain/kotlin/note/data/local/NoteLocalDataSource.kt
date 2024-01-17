package note.data.local


class NoteLocalDataSource {
    private val noteList = mutableListOf<NoteDTO>()

    suspend fun insertNote(dto: NoteDTO): NoteDTO {
        noteList.add(
            dto.copy(
                id = noteList.size.toString()
            )
        )
        return dto
    }

    suspend fun updateNote(dto: NoteDTO): NoteDTO {
        val index = noteList.indexOfFirst { it.id == dto.id }
        noteList[index] = dto
        return dto
    }

    suspend fun getById(id: String): NoteDTO {
        return noteList.first { it.id == id }
    }

    suspend fun getAll(): List<NoteDTO> {
        return noteList
    }

    suspend fun delete(id: String) {
        noteList.removeAll { it.id == id }
    }
}