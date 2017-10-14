package com.example.david.valeettest.ListComics.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.david.valeettest.ListComics.presenter.ListComicsPresenter
import com.example.david.valeettest.ListComics.ui.adapter.ComicsListAdapter
import com.example.david.valeettest.ListComics.ui.adapter.OnItemClick
import com.example.david.valeettest.ListComicsApp
import com.example.david.valeettest.R
import com.example.david.valeettest.comicDetails.ui.ComicDetailsActivity
import com.example.david.valeettest.entities.Comic
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class ListComicsActivity : AppCompatActivity(), ListComicsView, OnItemClick {

    @Inject
    lateinit var presenter: ListComicsPresenter

    @Inject
    lateinit var adapter: ComicsListAdapter

    @Inject
    lateinit var gson: Gson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ListComicsApp.listComicsComponent(this, this, this).inject(this)

        setupRecyclerView()

        presenter.onCreate()
    }

    private fun setupRecyclerView() {
        comicsRecycler.adapter = adapter
        comicsRecycler.layoutManager = LinearLayoutManager(this)
    }

    override fun getComicsAndFillView(comics: List<Comic>?) {
        adapter.setComicList(comics)
        adapter.notifyDataSetChanged()
    }

    override fun onClick(comic: Comic?) {
        val intent = Intent(this, ComicDetailsActivity::class.java)

        var jsonComic = gson.toJson(comic)

        intent.putExtra("COMIC", jsonComic)

        startActivity(intent)
    }
}
