package com.ramsay.memeapp.models.di

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Network {

fun provideApiService (): Retrofit {
    return Retrofit.Builder().baseUrl("https://api.imgflip.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}
}