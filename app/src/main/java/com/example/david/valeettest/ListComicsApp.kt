package com.example.david.valeettest

import android.app.Application
import com.example.david.valeettest.ListComics.ui.ListComicsView
import com.example.david.valeettest.ListComics.di.*
import com.example.david.valeettest.ListComics.ui.ListComicsActivity
import com.example.david.valeettest.ListComics.ui.adapter.OnItemClick
import com.example.david.valeettest.comicDetails.di.ComicDetailsComponent
import com.example.david.valeettest.comicDetails.di.ComicDetailsModule
import com.example.david.valeettest.comicDetails.di.DaggerComicDetailsComponent
import com.example.david.valeettest.comicDetails.ui.ComicDetailsView

/**
 * Created by david on 11/10/17.
 */
class ListComicsApp: Application() {

    companion object {
        fun listComicsComponent(view: ListComicsView, activity: ListComicsActivity, onClick: OnItemClick): ListComicsComponent {
            return DaggerListComicsComponent.builder()
                    .listComicsModule(ListComicsModule(view, activity, onClick))
                    .build()
        }

        fun comicDetailsComponent(view: ComicDetailsView) : ComicDetailsComponent {
            return DaggerComicDetailsComponent.builder()
                    .comicDetailsModule(ComicDetailsModule(view))
                    .build()
        }
    }
}