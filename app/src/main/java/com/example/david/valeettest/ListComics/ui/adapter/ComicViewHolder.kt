package com.example.david.valeettest.ListComics.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.david.valeettest.entities.Comic
import kotlinx.android.synthetic.main.item_comic.view.*

/**
 * Created by david on 12/10/17.
 */
class ComicViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    fun bindComic(comic: Comic?){
        itemView.comicName.text = comic?.title
    }
}