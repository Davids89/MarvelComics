package com.example.david.valeettest.comicDetails.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.RequestManager

import com.example.david.valeettest.ListComicsApp
import com.example.david.valeettest.R
import com.example.david.valeettest.comicDetails.ComicDetailsPresenter
import com.example.david.valeettest.entities.Comic
import com.example.david.valeettest.lib.ImageLoader
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_comic_details.*
import javax.inject.Inject

class ComicDetailsActivity : AppCompatActivity(), ComicDetailsView {

    @Inject
    lateinit var presenter: ComicDetailsPresenter

    @Inject
    lateinit var gson: Gson

    @Inject
    lateinit var imageLoader: ImageLoader

    lateinit var comic: Comic

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic_details)

        ListComicsApp.comicDetailsComponent(this, this).inject(this)

        presenter.onCreate()

        getComicFromExtra()
        setViewData()
    }



    private fun getComicFromExtra() {
        val comicString: String = intent.getStringExtra("COMIC")

        comic = gson.fromJson(comicString, Comic::class.java)
    }

    private fun setViewData() {
        comicName.text = comic.title
        imageLoader.loadImage(comicImage, comic.images!![0].path!! + '.' + comic.images!![0].extension)
    }
}
