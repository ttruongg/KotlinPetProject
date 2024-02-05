package com.example.roomwordsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.roomwordsample.Repository.WordRepository
import com.example.roomwordsample.model.Word
import kotlinx.coroutines.launch

class ViewModel(private val repository: WordRepository) : ViewModel() {
    val allWords: LiveData<List<Word>> = repository.allWords.asLiveData()

    fun insert(word: Word) = viewModelScope.launch {
        repository.insert(word)
    }
}

class ViewModelFactory(private val repository: WordRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(com.example.roomwordsample.ViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return ViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel")
    }
}