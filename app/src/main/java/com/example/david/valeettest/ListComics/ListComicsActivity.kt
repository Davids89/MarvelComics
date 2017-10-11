package com.example.david.valeettest.ListComics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.david.valeettest.ListComics.presenter.ListComicsPresenter
import com.example.david.valeettest.ListComicsApp
import com.example.david.valeettest.R
import javax.inject.Inject

class ListComicsActivity : AppCompatActivity(), ListComicsView {

   @Inject
   lateinit var presenter: ListComicsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ListComicsApp.listComicsComponent(this).inject(this)

        presenter.onCreate()
    }
}
