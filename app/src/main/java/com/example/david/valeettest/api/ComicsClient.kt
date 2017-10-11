package com.example.david.valeettest.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by david on 11/10/17.
 */
class ComicsClient {
    private var retrofit: Retrofit

    companion object {
        var BASE_URL = "http://gateway.marvel.com/v1/public/"
    }

    init {
        val client: OkHttpClient.Builder = OkHttpClient.Builder()
        val logginInterceptor: HttpLoggingInterceptor = HttpLoggingInterceptor()
        logginInterceptor.level = HttpLoggingInterceptor.Level.BODY
        client.addInterceptor(logginInterceptor)

        this.retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client.build())
                .build()
    }
}