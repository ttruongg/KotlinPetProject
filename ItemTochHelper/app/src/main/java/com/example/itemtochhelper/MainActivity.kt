package com.example.itemtochhelper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.itemtochhelper.ItemTouchHelper.SwipeToDeleteCallBack
import com.example.itemtochhelper.adapter.UserAdapter
import com.example.itemtochhelper.data.DataSource
import com.example.itemtochhelper.model.user

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var UserList: MutableList<user> = DataSource().loadUser()
        val rcv: RecyclerView = findViewById(R.id.rcv_user)


        rcv.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = UserAdapter(UserList)
        }

        val swipeToDeleteCallBack = object : SwipeToDeleteCallBack(){
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                UserList.removeAt(position)
                rcv.adapter?.notifyItemRemoved(position)

            }

        }

        val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallBack)
        itemTouchHelper.attachToRecyclerView(rcv)
    }
}