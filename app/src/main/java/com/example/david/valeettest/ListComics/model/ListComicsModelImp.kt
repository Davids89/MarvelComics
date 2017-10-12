package com.example.david.valeettest.ListComics.model

import com.example.david.valeettest.BuildConfig
import com.example.david.valeettest.api.ComicsClient
import com.example.david.valeettest.api.ComicsResponse
import io.reactivex.Observable
import org.apache.commons.codec.binary.Hex
import org.apache.commons.codec.digest.DigestUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

/**
 * Created by david on 11/10/17.
 */
class ListComicsModelImp(var client: ComicsClient): ListComicsModel {

    override fun getComics(): Observable<ComicsResponse> {

        return Observable.create { subscriber ->

            val ts: Long = Date().time
            val hash: String = String(Hex.encodeHex(DigestUtils.md5(ts.toString() + BuildConfig.MARVEL_PRIVATE + BuildConfig.MARVEL_APIKEY)))

            val response = client.callComics().getComics(BuildConfig.MARVEL_APIKEY, ts.toString(), hash).execute()

            if(response.isSuccessful) {
                subscriber.onNext(response.body()!!)
                subscriber.onComplete()
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }
}


