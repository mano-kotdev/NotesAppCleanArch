package com.manoj.notes.domain.useCase

import com.manoj.notes.domain.model.Note
import com.manoj.notes.domain.repository.NoteRepository
import javax.inject.Inject

class GetNote @Inject constructor(private val repo: NoteRepository) {
    suspend operator fun invoke(id: Int): Note? =
        repo.getNoteById(id)
}