package com.example.david.valeettest.ListComics.presenter

import com.example.david.valeettest.ListComics.ui.ListComicsView
import com.example.david.valeettest.ListComics.model.ListComicsModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by david on 11/10/17.
 */

class ListComicsPresenterImp(var view: ListComicsView, var model: ListComicsModel) : ListComicsPresenter {

    override fun onCreate() {
        model.getComics()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    comics ->
                    view.getComicsAndFillView(comics.data!!.comics)
                }, {
                    e ->
                    println(e.localizedMessage.toString())
                })
    }

}