package com.manoj.notes.data.dataSource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.manoj.notes.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DB_NAME = "notes_app_db"
    }

}