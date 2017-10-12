package com.example.david.valeettest.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by david on 12/10/17.
 */

class Characters {
    @SerializedName("available")
    var available: Int? = null
    @SerializedName("collectionURI")
    var collectionURI: String? = null
    @SerializedName("items")
    var items: List<Any>? = null
    @SerializedName("returned")
    var returned: Int? = null
}
