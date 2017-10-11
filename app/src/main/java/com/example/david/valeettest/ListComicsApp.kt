package com.example.david.valeettest

import android.app.Application
import com.example.david.valeettest.ListComics.ListComicsView
import com.example.david.valeettest.ListComics.di.DaggerListComicsComponent
import com.example.david.valeettest.ListComics.di.ListComicsComponent
import com.example.david.valeettest.ListComics.di.ListComicsModule

/**
 * Created by david on 11/10/17.
 */
class ListComicsApp: Application() {

    companion object {
        fun listComicsComponent(view: ListComicsView): ListComicsComponent {
            return DaggerListComicsComponent.builder()
                    .listComicsModule(ListComicsModule(view))
                    .build()
        }
    }
}