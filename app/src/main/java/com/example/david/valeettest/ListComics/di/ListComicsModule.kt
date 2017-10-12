package com.example.david.valeettest.ListComics.di

import com.example.david.valeettest.ListComics.ListComicsView
import com.example.david.valeettest.ListComics.model.ListComicsModel
import com.example.david.valeettest.ListComics.model.ListComicsModelImp
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
    fun providesListComicsPresenter(model: ListComicsModel): ListComicsPresenter {
        return ListComicsPresenterImp(view, model)
    }

    @Provides
    fun providesListComicsModel(): ListComicsModel {
        return ListComicsModelImp()
    }
}