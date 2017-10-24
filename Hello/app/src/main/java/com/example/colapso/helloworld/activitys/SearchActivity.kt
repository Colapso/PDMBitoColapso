package com.example.colapso.helloworld.activitys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.colapso.helloworld.R
import kotlinx.android.synthetic.main.activity_main.*

class SearchActivity : AppCompatActivity() {

    companion object {
        var SEARCH_VALUE: String = "SEARCH VALUE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonsListener()

    }



    private fun buttonsListener(){

        searchButton.setOnClickListener {
            val search = searchInput.text
            val intent = Intent(this, ResultsActivity::class.java)
            intent.putExtra(SEARCH_VALUE, search.toString())
            startActivity(intent)
        }

        upcoming_button.setOnClickListener{
            val search = "Upcoming Movies!"
            val intent = Intent(this, ResultsActivity::class.java)
            intent.putExtra(SEARCH_VALUE, search)
            //ToDo saber qual é o metodo que tera que fazer
            startActivity(intent)
        }

        now_playing_button.setOnClickListener{
            val search = "Now Playing Movies!"
            val intent = Intent(this, ResultsActivity::class.java)
            intent.putExtra(SEARCH_VALUE, search)
            //ToDo saber qual é o metodo que tera que fazer
            startActivity(intent)
        }

        pupular_button.setOnClickListener{
            val search = "Popular Movies!"
            val intent = Intent(this, ResultsActivity::class.java)
            intent.putExtra(SEARCH_VALUE, search)
            //ToDo saber qual é o metodo que tera que fazer
            startActivity(intent)
        }

    }
}