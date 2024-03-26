package com.manoj.notes.domain.useCase

import com.manoj.notes.domain.model.Note
import com.manoj.notes.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNote @Inject constructor(private val repo: NoteRepository) {
    suspend operator fun invoke(note: Note) {
        repo.deleteNote(note)
    }
}