package com.example.david.valeettest.ListComics.di

import com.example.david.valeettest.ListComics.ListComicsActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by david on 11/10/17.
 */
@Component(modules = arrayOf(ListComicsModule::class))
@Singleton
interface ListComicsComponent {
    fun inject(listComicsActivity: ListComicsActivity)
}