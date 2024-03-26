package com.manoj.notes.domain.useCase

import com.manoj.notes.domain.model.InvalidNoteException
import com.manoj.notes.domain.model.Note
import com.manoj.notes.domain.repository.NoteRepository
import javax.inject.Inject
import kotlin.jvm.Throws

class AddNote @Inject constructor(private val repo: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) throw InvalidNoteException("Title can not be empty")
        if (note.content.isBlank()) throw InvalidNoteException("Content can not be empty")
        repo.insertNote(note)
    }
}