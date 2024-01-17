package note.data.repository

import note.domain.NoteModel
import note.domain.NoteRepository

class NoteRepositoryImpl :   NoteRepository{
    override suspend fun insertNote(note: NoteModel): Result<NoteModel> {
        TODO("Not yet implemented")
    }

    override suspend fun updateNote(note: NoteModel): Result<NoteModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getById(id: String): Result<NoteModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getAll(): Result<List<NoteModel>> {
        TODO("Not yet implemented")
    }

    override suspend fun delete(): Result<Unit> {
        TODO("Not yet implemented")
    }
}