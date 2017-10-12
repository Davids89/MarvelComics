package com.example.david.valeettest.lib

import android.widget.ImageView
import java.net.URL

/**
 * Created by david on 12/10/17.
 */
interface ImageLoader {
    fun loadImage(imageView: ImageView, url: String)
}