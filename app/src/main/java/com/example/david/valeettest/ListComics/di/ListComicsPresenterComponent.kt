package com.example.david.valeettest.ListComics.di

import com.example.david.valeettest.ListComics.presenter.ListComicsPresenter
import com.example.david.valeettest.ListComics.presenter.ListComicsPresenterImp
import dagger.Component
import javax.inject.Singleton

/**
 * Created by david on 11/10/17.
 */
@Component(modules = arrayOf(ListComicsPresenterModule::class))
@Singleton
interface ListComicsPresenterComponent {
    fun inject(listComicsPresenter: ListComicsPresenterImp)
}