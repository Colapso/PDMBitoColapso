package com.example.colapso.helloworld.activitys

import android.content.Intent
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.colapso.helloworld.R
import kotlinx.android.synthetic.main.activity_main.*

import com.example.colapso.helloworld.moviesAPI.Provider

class SearchActivity : AppCompatActivity() {

    companion object {
        var SEARCH_VALUE: String = "SEARCH VALUE"
        var METHOD: String = "METHOD"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonsListener()

    }





    private fun buttonsListener(){

        searchButton.setOnClickListener {
            val methodTocall = "1"
            val search = searchInput.text
            val intent = Intent(this, ResultsActivity::class.java)
            intent.putExtra(SEARCH_VALUE, search.toString())
            intent.putExtra(METHOD, methodTocall)
            startActivity(intent)
        }

        upcoming_button.setOnClickListener{

            val methodTocall = "2"
            val intent = Intent(this, ResultsActivity::class.java)
            intent.putExtra(METHOD, methodTocall)
            //ToDo saber qual é o metodo que tera que fazer
            startActivity(intent)
        }

        now_playing_button.setOnClickListener{
            val methodTocall = "3"
            val intent = Intent(this, ResultsActivity::class.java)
            intent.putExtra(METHOD, methodTocall)
            //ToDo saber qual é o metodo que tera que fazer
            startActivity(intent)
        }

        pupular_button.setOnClickListener{
            val methodTocall = "4"
            val intent = Intent(this, ResultsActivity::class.java)
            intent.putExtra(METHOD, methodTocall)
            //ToDo saber qual é o metodo que tera que fazer
            startActivity(intent)
        }

    }
}