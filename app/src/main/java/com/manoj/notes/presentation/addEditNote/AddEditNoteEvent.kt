package com.manoj.notes.presentation.addEditNote

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent {
    data class EnteredTitle(val title: String) : AddEditNoteEvent()

    data class ChangeTitleFocus(val focusedState: FocusState) : AddEditNoteEvent()

    data class EnteredContent(val content: String) : AddEditNoteEvent()

    data class ChangeContentFocus(val focusedState: FocusState) : AddEditNoteEvent()

    data class ChangeColor(val color: Int) : AddEditNoteEvent()

    data object SaveNote : AddEditNoteEvent()
}