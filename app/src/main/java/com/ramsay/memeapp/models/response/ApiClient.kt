package com.ramsay.memeapp.models.response

import retrofit2.http.GET

interface ApiClient {

    @GET("/get_memes")
    suspend fun getMeme() : ResponseDTO
}