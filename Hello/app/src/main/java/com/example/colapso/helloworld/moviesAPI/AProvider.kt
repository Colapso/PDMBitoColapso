package com.example.colapso.helloworld.moviesAPI

import android.support.annotation.RequiresApi
import android.support.v4.app.ActionBarDrawerToggle
import com.example.colapso.helloworld.Movie
import com.example.colapso.helloworld.MovieDetailed
import java.util.function.Consumer

/**
 * Created by Bernardo Costa on 10/10/2017.
 */
abstract class AProvider {

    companion object {
        val SEARCH_MOVIES : String = "https://api.themoviedb.org/3/search/movie?api_key=%s&query=%s"
        val NOW_PLAYING_MOVIES : String = "https://api.themoviedb.org/3/movie/now_playing?api_key=%s"
        val UPCOMING_MOVIES : String = "https://api.themoviedb.org/3/movie/upcoming?api_key=%s"
        val POPULAR_MOVIES : String = "https://api.themoviedb.org/3/movie/popular?api_key=%s"
        val KEY : String = "44115219543c4d21e1901c9503b9e6ee"
    }


    abstract fun getFilmByName(namePart: String) : List<Movie>
    abstract fun getUpComingMovies() : List<Movie>
    abstract fun getMovieInfo(movieName: String) : MovieDetailed
    abstract fun getPopularMovies() : List<Movie>
    abstract fun getNowPlayingMovies() : List<Movie>

}