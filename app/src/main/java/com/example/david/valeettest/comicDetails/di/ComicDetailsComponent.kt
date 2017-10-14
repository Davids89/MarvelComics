package com.example.david.valeettest.comicDetails.di

import com.example.david.valeettest.comicDetails.ui.ComicDetailsActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by david on 14/10/17.
 */
@Component(modules = arrayOf(ComicDetailsModule::class))
@Singleton
interface ComicDetailsComponent {
    fun inject(comicDetailsActivity: ComicDetailsActivity)
}