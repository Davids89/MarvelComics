package com.example.david.valeettest.ListComics.presenter

import com.example.david.valeettest.ListComics.ListComicsView
import com.example.david.valeettest.ListComics.model.ListComicsModel
import com.example.david.valeettest.ListComicsApp
import javax.inject.Inject

/**
 * Created by david on 11/10/17.
 */

class ListComicsPresenterImp(var view: ListComicsView) : ListComicsPresenter {

    @Inject
    lateinit var model: ListComicsModel

    override fun onCreate() {

        ListComicsApp.listComicsPresenterComponent().inject(this)

        model.getComics()
    }

}