package com.example.david.valeettest.ListComics.di

import com.example.david.valeettest.ListComics.ListComicsView
import com.example.david.valeettest.ListComics.presenter.ListComicsPresenter
import com.example.david.valeettest.ListComics.presenter.ListComicsPresenterImp
import dagger.Module
import dagger.Provides

/**
 * Created by david on 11/10/17.
 */
@Module
class ListComicsModule(var view: ListComicsView) {

    @Provides
    fun providesListComicsPresenter(): ListComicsPresenter {
        return ListComicsPresenterImp(view)
    }
}