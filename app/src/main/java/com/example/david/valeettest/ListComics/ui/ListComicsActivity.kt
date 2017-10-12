package com.example.david.valeettest.ListComics.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.david.valeettest.ListComics.presenter.ListComicsPresenter
import com.example.david.valeettest.ListComics.ui.adapter.ComicsListAdapter
import com.example.david.valeettest.ListComicsApp
import com.example.david.valeettest.R
import com.example.david.valeettest.entities.Comic
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class ListComicsActivity : AppCompatActivity(), ListComicsView {

    @Inject
    lateinit var presenter: ListComicsPresenter

    @Inject
    lateinit var adapter: ComicsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ListComicsApp.listComicsComponent(this, this).inject(this)

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
}
