package com.example.itemtochhelper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.itemtochhelper.adapter.UserAdapter
import com.example.itemtochhelper.data.DataSource

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rcv: RecyclerView = findViewById(R.id.rcv_user)
        val adapter = UserAdapter(this, DataSource().loadUser())
        rcv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rcv.adapter = adapter
        rcv.setHasFixedSize(true)



    }
}