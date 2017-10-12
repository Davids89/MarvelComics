package com.example.david.valeettest.api

import com.example.david.valeettest.ListComics.entities.Comic
import com.google.gson.annotations.SerializedName

/**
 * Created by david on 12/10/17.
 */
class DataResponse {
    @SerializedName("offset")
    var offset: Int? = null
    @SerializedName("limit")
    var limit: Int? = null
    @SerializedName("total")
    var total: Int? = null
    @SerializedName("count")
    var count: Int? = null
    @SerializedName("results")
    var comics: List<Comic>? = null
}