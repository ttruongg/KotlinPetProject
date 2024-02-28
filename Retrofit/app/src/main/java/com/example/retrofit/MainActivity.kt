package com.example.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import com.example.retrofit.Interface.AlbumService
import com.example.retrofit.databinding.ActivityMainBinding
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val retrofit = RetrofitInstance.getRetrofitInstance().create(AlbumService::class.java)

        val responsive: LiveData<Response<Albums>> =
            liveData {
                val response = retrofit.getAlbums()
                emit(response)
            }

        responsive.observe(this, Observer {
            val albumList = it.body()?.listIterator()
            if (albumList != null){
                while (albumList.hasNext()){
                    val item = albumList.next()
                    val titles = "Album title: + ${item.title} \n"
                    binding.title.append(titles)
                }

            }
        })
    }
}