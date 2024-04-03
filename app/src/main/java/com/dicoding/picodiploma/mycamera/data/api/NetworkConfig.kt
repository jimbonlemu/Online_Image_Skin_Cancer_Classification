package com.dicoding.picodiploma.mycamera.data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object NetworkConfig {
    fun connectApiService(): NetworkService {
        val loggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()
        val retrofit = Retrofit.Builder().baseUrl("https://classification-api.dicoding.dev/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client).build()
        return retrofit.create(NetworkService::class.java)
    }
}