package com.example.david.valeettest.comicDetails.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.david.valeettest.ListComicsApp
import com.example.david.valeettest.R
import com.example.david.valeettest.comicDetails.ComicDetailsPresenter
import com.example.david.valeettest.entities.Comic
import com.google.gson.Gson
import javax.inject.Inject

class ComicDetailsActivity : AppCompatActivity(), ComicDetailsView {

    @Inject
    lateinit var presenter: ComicDetailsPresenter

    @Inject
    lateinit var gson: Gson

    lateinit var comic: Comic

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic_details)

        ListComicsApp.comicDetailsComponent(this).inject(this)

        presenter.onCreate()

        getComicFromExtra()
    }

    private fun getComicFromExtra() {
        val comicString: String = intent.getStringExtra("COMIC")

        comic = gson.fromJson(comicString, Comic::class.java)
    }
}
