package com.example.david.valeettest.ListComics.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.david.valeettest.entities.Comic
import com.example.david.valeettest.lib.ImageLoader
import kotlinx.android.synthetic.main.item_comic.view.*
import java.net.URL

/**
 * Created by david on 12/10/17.
 */
class ComicViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    fun bindComic(comic: Comic?, imageLoader: ImageLoader){
        itemView.comicName.text = comic?.title
        if(comic?.images!!.isNotEmpty())
            imageLoader.loadImage(itemView.comicImage, comic.images[0].path + "." + comic.images[0].extension)
    }
}