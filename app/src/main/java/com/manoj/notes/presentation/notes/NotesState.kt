package com.manoj.notes.presentation.notes

import com.manoj.notes.domain.model.Note
import com.manoj.notes.domain.util.NoteOrder
import com.manoj.notes.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)