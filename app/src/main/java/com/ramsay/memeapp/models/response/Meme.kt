package com.ramsay.memeapp.models.response


import com.google.gson.annotations.SerializedName

data class Meme(
    @SerializedName("box_count")
    val boxCount: Int,
    @SerializedName("height")
    val height: Int,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("width")
    val width: Int
)