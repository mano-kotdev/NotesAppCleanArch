package com.manoj.notes.di

import android.app.Application
import androidx.room.Room
import com.manoj.notes.data.dataSource.NoteDatabase
import com.manoj.notes.data.repository.NoteRepositoryImpl
import com.manoj.notes.domain.repository.NoteRepository
import com.manoj.notes.domain.useCase.AddNote
import com.manoj.notes.domain.useCase.DeleteNote
import com.manoj.notes.domain.useCase.GetAllNotes
import com.manoj.notes.domain.useCase.GetNote
import com.manoj.notes.domain.useCase.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DB_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository = NoteRepositoryImpl(db.noteDao)

    @Provides
    @Singleton
    fun provideNoteUseCases(noteRepository: NoteRepository): NoteUseCases{
        return NoteUseCases(
            addNote = AddNote(noteRepository),
            deleteNote = DeleteNote(noteRepository),
            getNote = GetNote(noteRepository),
            getAllNotes = GetAllNotes(noteRepository)
        )
    }

}