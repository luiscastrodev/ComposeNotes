package note.data.repository

import note.data.local.NoteLocalDataSource
import note.data.local.NoteDTO
import note.domain.NoteModel
import note.domain.NoteRepository

class NoteRepositoryImpl(
    private val noteLocalDataSource: NoteLocalDataSource
) : NoteRepository {
    override suspend fun insertNote(note: NoteModel): Result<NoteModel> =
        try {
            val dto = noteLocalDataSource.insertNote(NoteDTO.fromModel(note))
            Result.success(dto.toModel())
        } catch (e: Exception) {
            Result.failure(e)
        }

    override suspend fun updateNote(note: NoteModel): Result<NoteModel> =
        runCatching {
            noteLocalDataSource.updateNote(NoteDTO.fromModel(note)).toModel()
        }

    override suspend fun getById(id: String): Result<NoteModel> {
        return runCatching {
            noteLocalDataSource.getById(id).toModel()
        }
    }

    override suspend fun getAll(): Result<List<NoteModel>> {
        return runCatching {
            noteLocalDataSource.getAll().map {
                it.toModel()
            }
        }
    }

    override suspend fun delete(id: String): Result<Unit> {
        return runCatching {
            noteLocalDataSource.delete(id)
        }
    }
}