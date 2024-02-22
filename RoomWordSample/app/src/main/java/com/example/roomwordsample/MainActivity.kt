package com.example.roomwordsample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roomwordsample.adapter.WordListAdapter
import com.example.roomwordsample.model.Word
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    lateinit var viewModel: WordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rcv_word)
        val adapter = WordListAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        ).get(WordViewModel::class.java)

        viewModel.deleteAll()
        viewModel.allWords.observe(this, Observer { list ->
            list?.let {
                adapter.setData(it)
            }

        })

        val edt_word = findViewById<EditText>(R.id.edt_word)
        val btn_save = findViewById<Button>(R.id.btn_insert)
        btn_save.setOnClickListener {
            val word = edt_word.text.toString()
            if (word.isNotEmpty()) {
                viewModel.insert(Word(word))
                Toast.makeText(this, "$word Inserted", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, R.string.empty_word, Toast.LENGTH_LONG).show()
            }
        }

    }


}
