package com.example.david.valeettest.ListComics.model

import com.example.david.valeettest.BuildConfig
import com.example.david.valeettest.api.ComicsClient
import com.example.david.valeettest.api.ComicsResponse
import org.apache.commons.codec.binary.Hex
import org.apache.commons.codec.digest.DigestUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.security.MessageDigest
import java.util.*

/**
 * Created by david on 11/10/17.
 */
class ListComicsModelImp(var client: ComicsClient): ListComicsModel {

    override fun getComics() {

        val ts: Long = Date().time
        val hash: String = String(Hex.encodeHex(DigestUtils.md5(ts.toString() + BuildConfig.MARVEL_PRIVATE + BuildConfig.MARVEL_APIKEY)))

        client.callComics().getComics(BuildConfig.MARVEL_APIKEY, ts.toString(), hash).enqueue()
    }

    private fun Call<ComicsResponse>.enqueue() {
        enqueue(object : Callback<ComicsResponse> {
            override fun onResponse(call: Call<ComicsResponse>?, response: Response<ComicsResponse>?) {
                
            }

            override fun onFailure(call: Call<ComicsResponse>?, t: Throwable?) {
                println(t?.localizedMessage.toString())
            }
        })
    }
}


