package com.example.david.valeettest.ListComics.presenter

import com.example.david.valeettest.ListComics.ListComicsView
import com.example.david.valeettest.ListComics.model.ListComicsModel
/**
 * Created by david on 11/10/17.
 */

class ListComicsPresenterImp(var view: ListComicsView, var model: ListComicsModel) : ListComicsPresenter {

    override fun onCreate() {
        model.getComics()
    }

}