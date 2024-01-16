package note.domain

interface NoteRepository {

    suspend fun insertNote(note: NoteModel): Result<NoteModel>

    suspend fun updateNote(note: NoteModel): Result<NoteModel>

    suspend fun getById(id: String): Result<NoteModel>

    suspend fun getAll(): Result<List<NoteModel>>

    suspend fun delete(): Result<Unit>

}