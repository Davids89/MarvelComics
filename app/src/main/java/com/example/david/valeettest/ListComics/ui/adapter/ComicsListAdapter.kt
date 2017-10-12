package com.example.david.valeettest.ListComics.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.david.valeettest.R
import com.example.david.valeettest.entities.Comic
import com.example.david.valeettest.lib.ImageLoader

/**
 * Created by david on 12/10/17.
 */
class ComicsListAdapter(var imageLoader: ImageLoader): RecyclerView.Adapter<ComicViewHolder>() {

    var comicsList: List<Comic>? = listOf()

    override fun onBindViewHolder(holder: ComicViewHolder?, position: Int) {
        val comic = comicsList?.get(position)

        holder!!.bindComic(comic, imageLoader)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ComicViewHolder {
        val view: View = LayoutInflater.from(parent!!.context).inflate(R.layout.item_comic, parent, false)

        return ComicViewHolder(view)
    }

    fun setComicList(comics: List<Comic>?) {
        this.comicsList = comics
    }

    override fun getItemCount(): Int {
        return this.comicsList!!.size
    }
}