package com.example.david.valeettest.ListComics.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by david on 12/10/17.
 */

class Creators {
    @SerializedName("available")
    var available: Int? = null
    @SerializedName("collectionURI")
    var collectionURI: String? = null
    @SerializedName("items")
    var items: List<Item>? = null
    @SerializedName("returned")
    var returned: Int? = null
}
