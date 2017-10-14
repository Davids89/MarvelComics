package com.example.david.valeettest.comicDetails.di

import com.bumptech.glide.Glide
import com.example.david.valeettest.comicDetails.ComicDetailsPresenter
import com.example.david.valeettest.comicDetails.ComicDetailsPresenterImpl
import com.example.david.valeettest.comicDetails.ui.ComicDetailsActivity
import com.example.david.valeettest.comicDetails.ui.ComicDetailsView
import com.example.david.valeettest.lib.GlideImageLoader
import com.example.david.valeettest.lib.ImageLoader
import com.google.gson.Gson
import dagger.Module
import dagger.Provides

/**
 * Created by david on 14/10/17.
 */
@Module
class ComicDetailsModule(var view: ComicDetailsView, var activity: ComicDetailsActivity) {

    @Provides
    fun providesComicDetailsPresenter(): ComicDetailsPresenter {
        return ComicDetailsPresenterImpl()
    }

    @Provides
    fun providesGson(): Gson {
        return Gson()
    }

    @Provides
    fun providesGlide(): ImageLoader {
        return GlideImageLoader(Glide.with(activity))
    }
}