package com.example.david.valeettest.api

import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by david on 11/10/17.
 */
interface ComicsService {
    @GET("comics")
    fun getComics(): Call<ComicsResponse>
}