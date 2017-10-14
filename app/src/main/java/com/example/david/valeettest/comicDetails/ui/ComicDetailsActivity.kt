package com.example.david.valeettest.comicDetails.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.david.valeettest.ListComicsApp
import com.example.david.valeettest.R
import com.example.david.valeettest.comicDetails.ComicDetailsPresenter
import javax.inject.Inject

class ComicDetailsActivity : AppCompatActivity(), ComicDetailsView {

    @Inject
    lateinit var presenter: ComicDetailsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic_details)

        ListComicsApp.comicDetailsComponent(this).inject(this)

        presenter.onCreate()
    }
}
