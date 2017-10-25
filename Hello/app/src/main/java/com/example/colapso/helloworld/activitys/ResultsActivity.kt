package com.example.colapso.helloworld.activitys

import android.app.Application
import android.app.ProgressDialog
import android.content.Context
import android.os.AsyncTask
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_b.*
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.example.colapso.helloworld.Movie
import com.example.colapso.helloworld.R
import com.example.colapso.helloworld.dto.PopularMoviesDto
import com.example.colapso.helloworld.dto.UpComingMoviesDTO
import com.example.colapso.helloworld.moviesAPI.AProvider
import com.example.colapso.helloworld.moviesAPI.Provider
import com.example.colapso.helloworld.moviesAPI.requestQueue
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue


class ResultsActivity : AppCompatActivity() {

    companion object {
        lateinit var movieList: ListView
        lateinit var adapter: ArrayAdapter<String>
        lateinit var context : Context
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val value = intent.getStringExtra(SearchActivity.SEARCH_VALUE)
        val method = intent.getStringExtra(SearchActivity.METHOD)
        val results = "Results for: " + value

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1)
        //ToDo criar um layout para cada item da ListView
        movieList.adapter = adapter

        movieList.setOnItemClickListener { adapterView, view, i, l ->
            //ToDo instancia uma nova Atividade com a informaçao toda detalhada do filme
        }

        searchResults.setText(results)
        context = this;
        getMovies().execute()
        val p = Provider(application)
        when(method)
        {
            "1" -> {
                p.getFilmByName(value)
            }
            "2" -> {

                p.getUpComingMovies()

            }
            "3" -> {
                p.getNowPlayingMovies()
            }
            "4" -> {
                p.getPopularMovies()
            }
        }
    }

    internal inner class getMovies : AsyncTask<Void,Void,String>()
    {

        lateinit var progressDialog : ProgressDialog

        override fun onPreExecute()
        {
            super.onPreExecute()
            progressDialog = ProgressDialog(context);
            progressDialog.setMessage("Downloading Movies List...")
            progressDialog.setCancelable(false)
            progressDialog.show()
        }

        override fun doInBackground(vararg p0: Void?): String
        {
            Thread.sleep(3000);


            return ""
        }

        override fun onPostExecute(result: String?)
        {
            super.onPostExecute(result)
            val text= "Movie list downloaded";
            Toast.makeText(this@ResultsActivity, text,Toast.LENGTH_LONG).show();
            progressDialog.dismiss()
        }
    }
}
