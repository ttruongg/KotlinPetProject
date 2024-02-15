package com.example.roomwordsample

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText

class NewWordActivity : AppCompatActivity() {
    lateinit var edtWord: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)

        edtWord = findViewById(R.id.edt_word)

        val button = findViewById<Button>(R.id.btn_save)
        button.setOnClickListener {
            val response = Intent()
            if (TextUtils.isEmpty(edtWord.text)) {
                setResult(Activity.RESULT_CANCELED, response)
            } else {
                val word = edtWord.text.toString()
                response.putExtra(EXTRA_REPLY, word)
                setResult(Activity.RESULT_OK, response)
            }
            finish()
        }

    }

    companion object {
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }
}