package com.example.affirmation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rcv: RecyclerView = findViewById(R.id.recycler_view)
        val ItemAdapter = ItemAdapter(this, DataSource().loadAffirmation())
        rcv.adapter = ItemAdapter
        rcv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rcv.setHasFixedSize(true)

    }
}