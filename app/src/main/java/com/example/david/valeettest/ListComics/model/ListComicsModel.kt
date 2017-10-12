package com.example.david.valeettest.ListComics.model

import com.example.david.valeettest.api.ComicsResponse
import io.reactivex.Observable

/**
 * Created by david on 11/10/17.
 */
interface ListComicsModel {
    fun getComics(): Observable<ComicsResponse>
}