package com.example.david.valeettest.ListComics.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by david on 12/10/17.
 */

class Item {
    @SerializedName("resourceURI")
    var resourceURI: String? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("role")
    var role: String? = null
}
