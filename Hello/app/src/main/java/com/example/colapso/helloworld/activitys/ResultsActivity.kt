package com.example.colapso.helloworld.activitys

import android.app.Application
import android.content.Context
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_b.*
import android.widget.AdapterView
import android.widget.ListView
import com.android.volley.toolbox.JsonObjectRequest
import com.example.colapso.helloworld.Movie
import com.example.colapso.helloworld.R
import com.example.colapso.helloworld.dto.PopularMoviesDto
import com.example.colapso.helloworld.moviesAPI.AProvider
import com.example.colapso.helloworld.moviesAPI.Provider
import com.example.colapso.helloworld.moviesAPI.requestQueue
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue


class ResultsActivity : AppCompatActivity() {

    companion object {
        lateinit var movieList: ListView
        lateinit var adapter: ArrayAdapter<String>
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val value = intent.getStringExtra(SearchActivity.SEARCH_VALUE)
        val results = "Results for: " + value

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1)
        //ToDo criar um layout para cada item da ListView
        movieList.adapter = adapter
        movieList.setOnItemClickListener { adapterView, view, i, l ->
            //ToDo instancia uma nova Atividade com a informaçao toda detalhada do filme
        }

        searchResults.setText(results)

        //Hard-coded
        val p = Provider(application)
        p.getPopularMovies()



    }
}
