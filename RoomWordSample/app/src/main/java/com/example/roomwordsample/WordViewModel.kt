package com.example.roomwordsample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.roomwordsample.Repository.WordRepository
import com.example.roomwordsample.db.WordRoomDatabase
import com.example.roomwordsample.model.Word
import kotlinx.coroutines.launch

class WordViewModel(application: Application) : AndroidViewModel(application){

    private val repository: WordRepository
    val allWords: LiveData<List<Word>>

    init {
        val dao = WordRoomDatabase.getDatabase(application).wordDao()
        repository = WordRepository(dao)
        allWords = repository.allWords

    }


    fun insert(word: Word) = viewModelScope.launch {
        repository.insert(word)
    }

    fun deleteAll() = viewModelScope.launch {
        repository.deleteAll()
    }
}

