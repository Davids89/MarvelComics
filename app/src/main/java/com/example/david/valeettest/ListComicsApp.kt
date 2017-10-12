package com.example.david.valeettest

import android.app.Application
import com.example.david.valeettest.ListComics.ui.ListComicsView
import com.example.david.valeettest.ListComics.di.*
import com.example.david.valeettest.ListComics.ui.ListComicsActivity

/**
 * Created by david on 11/10/17.
 */
class ListComicsApp: Application() {

    companion object {
        fun listComicsComponent(view: ListComicsView, activity: ListComicsActivity): ListComicsComponent {
            return DaggerListComicsComponent.builder()
                    .listComicsModule(ListComicsModule(view, activity))
                    .build()
        }
    }
}