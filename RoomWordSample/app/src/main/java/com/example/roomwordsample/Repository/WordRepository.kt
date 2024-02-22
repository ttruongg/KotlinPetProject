package com.example.roomwordsample.Repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.roomwordsample.db.WordDao
import com.example.roomwordsample.model.Word
import kotlinx.coroutines.flow.Flow


class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()


    suspend fun insert(word: Word){
        wordDao.insert(word)
    }

    suspend fun deleteAll(){
        wordDao.deleteAll()
    }
}