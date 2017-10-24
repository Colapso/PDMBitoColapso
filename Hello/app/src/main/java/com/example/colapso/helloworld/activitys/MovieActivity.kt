package com.example.colapso.helloworld.activitys

import android.app.Application
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.toolbox.JsonObjectRequest
import com.example.colapso.helloworld.R
import com.example.colapso.helloworld.moviesAPI.requestQueue

import kotlinx.android.synthetic.main.activity_movie.*
import org.json.JSONObject

class MovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)


        backButton.setOnClickListener {
            val intent = Intent(this, ResultsActivity::class.java)
            startActivity(intent)
        }
    }
}
