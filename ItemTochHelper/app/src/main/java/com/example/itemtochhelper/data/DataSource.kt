package com.example.itemtochhelper.data

import com.example.itemtochhelper.model.user

class DataSource {
    fun loadUser(): MutableList<user>{
        return mutableListOf<user>(
            user("Ray", "2002"),
            user("Bryan", "2003"),
            user("Xiw", "2001"),
            user("Ruby", "2003"),
            user("Hisa", "2003")
        )
    }
}