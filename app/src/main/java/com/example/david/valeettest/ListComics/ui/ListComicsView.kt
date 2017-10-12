package com.example.david.valeettest.ListComics.ui

import com.example.david.valeettest.entities.Comic

/**
 * Created by david on 11/10/17.
 */
interface ListComicsView {
    fun getComicsAndFillView(comics: List<Comic>?)
}