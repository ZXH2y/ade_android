package com.example.adeainunfitrahramadhan.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object APIClient
{
    private const val BASE_URL = "http://10.33.80.246/program/html/android_backend/"

    val instace: APIServices by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(APIServices::class.java)

    }
}