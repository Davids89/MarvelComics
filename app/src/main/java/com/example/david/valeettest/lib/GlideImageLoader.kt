package com.example.david.valeettest.lib

import android.widget.ImageView
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import java.net.URL

/**
 * Created by david on 12/10/17.
 */
class GlideImageLoader(var glideRequestManager: RequestManager): ImageLoader {

    override fun loadImage(imageView: ImageView, url: String) {
        glideRequestManager.load(url)
                .into(imageView)
    }
}