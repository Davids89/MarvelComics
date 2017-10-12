package com.example.david.valeettest.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by david on 12/10/17.
 */

class Date {
    @SerializedName("type")
    var type: String? = null
    @SerializedName("date")
    var date: String? = null
}
