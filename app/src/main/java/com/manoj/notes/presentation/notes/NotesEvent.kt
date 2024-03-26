package com.manoj.notes.presentation.notes

import com.manoj.notes.domain.model.Note
import com.manoj.notes.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()

    data class DeleteNote(val note: Note) : NotesEvent()

    data object RestoreNote : NotesEvent()

    data object ToggleSectionOrder : NotesEvent()
}