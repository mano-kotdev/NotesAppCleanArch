package com.manoj.notes.domain.useCase

data class NoteUseCases(
    val addNote: AddNote,
    val deleteNote: DeleteNote,
    val getNote: GetNote,
    val getAllNotes: GetAllNotes
)
