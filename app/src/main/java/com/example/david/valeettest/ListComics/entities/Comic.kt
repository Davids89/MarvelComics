package com.example.david.valeettest.ListComics.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by david on 12/10/17.
 */

class Comic {
    @SerializedName("id")
    val id: Int? = null
    @SerializedName("title")
    val title: String? = null
    @SerializedName("description")
    val description: String? = null
    @SerializedName("images")
    val images: List<Image>? = null
    @SerializedName("creators")
    val creators: Creators? = null
    @SerializedName("characters")
    val characters: Characters? = null

}
