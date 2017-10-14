package com.example.david.valeettest.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by david on 11/10/17.
 */
interface ComicsService {
    @GET("comics?orderBy=title")
    fun getComics(@Query("apikey") apikey: String, @Query("ts") ts: String, @Query("hash") hash: String): Call<ComicsResponse>
}