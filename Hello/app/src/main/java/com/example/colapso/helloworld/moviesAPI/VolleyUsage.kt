package com.example.colapso.helloworld.moviesAPI

import android.app.Application
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

/**
 * Created by Bernardo Costa on 16/10/2017.
 */
class VolleyUsage : Application() {

    val requestQueue by lazy { Volley.newRequestQueue(this) }

    override fun onCreate() {
        super.onCreate()

    }

}
val Application.requestQueue : RequestQueue
    get() = (this as VolleyUsage).requestQueue