package com.example.david.valeettest.ListComics.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by david on 12/10/17.
 */

class Image {
    @SerializedName("path")
    var path: String? = null
    @SerializedName("extension")
    var extension: String? = null
}
