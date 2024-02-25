package com.example.navgraph

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    override fun onSupportNavigateUp(): Boolean {
        navController = findNavController(R.id.navHost_fragmentcontainer)

        return super.onSupportNavigateUp() || super.onSupportNavigateUp()
    }
}