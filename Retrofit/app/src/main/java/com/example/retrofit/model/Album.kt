package com.example.retrofit.model

import com.google.gson.annotations.SerializedName

data class Album(
    @SerializedName("id")
    val id: Int,

    @SerializedName("userid")
    val userid: Int,

    @SerializedName("title")
    val title: String
)
