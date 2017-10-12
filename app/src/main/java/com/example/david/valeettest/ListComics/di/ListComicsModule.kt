package com.example.david.valeettest.ListComics.di

import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.david.valeettest.ListComics.ui.ListComicsView
import com.example.david.valeettest.ListComics.model.ListComicsModel
import com.example.david.valeettest.ListComics.model.ListComicsModelImp
import com.example.david.valeettest.ListComics.presenter.ListComicsPresenter
import com.example.david.valeettest.ListComics.presenter.ListComicsPresenterImp
import com.example.david.valeettest.ListComics.ui.ListComicsActivity
import com.example.david.valeettest.ListComics.ui.adapter.ComicsListAdapter
import com.example.david.valeettest.api.ComicsClient
import com.example.david.valeettest.lib.GlideImageLoader
import dagger.Module
import dagger.Provides

/**
 * Created by david on 11/10/17.
 */
@Module
class ListComicsModule(var view: ListComicsView, var activity: ListComicsActivity) {

    @Provides
    fun providesListComicsPresenter(model: ListComicsModel): ListComicsPresenter {
        return ListComicsPresenterImp(view, model)
    }

    @Provides
    fun providesComicsAdapter(imageLoader: GlideImageLoader): ComicsListAdapter {
        return ComicsListAdapter(imageLoader)
    }

    @Provides
    fun providesListComicsModel(client: ComicsClient): ListComicsModel {
        return ListComicsModelImp(client)
    }

    @Provides
    fun providesRestClient(): ComicsClient {
        return ComicsClient()
    }

    @Provides
    fun providesGlide(): GlideImageLoader {
        return GlideImageLoader(Glide.with(activity))
    }
}