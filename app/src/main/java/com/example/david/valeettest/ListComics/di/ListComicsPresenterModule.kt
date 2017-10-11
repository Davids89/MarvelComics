package com.example.david.valeettest.ListComics.di

import com.example.david.valeettest.ListComics.model.ListComicsModel
import com.example.david.valeettest.ListComics.model.ListComicsModelImp
import dagger.Module
import dagger.Provides

/**
 * Created by david on 11/10/17.
 */
@Module
class ListComicsPresenterModule() {
    @Provides
    fun providesListComicsModel(): ListComicsModel {
        return ListComicsModelImp()
    }
}