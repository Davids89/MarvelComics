package com.example.david.valeettest.api

import com.example.david.valeettest.entities.Comic
import com.google.gson.annotations.SerializedName

/**
 * Created by david on 11/10/17.
 */
class ComicsResponse {
    @SerializedName("data")
    var data: DataResponse? = null
}