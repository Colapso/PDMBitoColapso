package com.example.colapso.helloworld.moviesAPI

import android.app.Application
import android.os.AsyncTask
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.example.colapso.helloworld.Movie
import com.example.colapso.helloworld.MovieDetailed
import com.example.colapso.helloworld.activitys.ResultsActivity
import com.example.colapso.helloworld.dto.PopularMoviesDto
import com.example.colapso.helloworld.dto.UpComingMoviesDTO
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

/**
 * Created by Bernardo Costa on 10/10/2017.
 */
class Provider(val app: Application) : AProvider() {

    override fun getUpComingMovies(): List<Movie> {

        val urlFormatted: String = String.format(UPCOMING_MOVIES, KEY)
        var movies: List<Movie> = listOf()

        app.requestQueue.add(StringRequest(
                urlFormatted,
                {
                    val jsonStr: String = it.toString();
                    val mapper = jacksonObjectMapper()
                    val upComingMoviesDto: UpComingMoviesDTO = mapper.readValue<UpComingMoviesDTO>(jsonStr)
                    movies = upComingMoviesDto.PopMovDtoToMovie(upComingMoviesDto)
                    for (mov: Movie in movies)
                        ResultsActivity.adapter.add(mov.title)
                },
                {
                    Log.e("Error", "Bad Request")
                }
        ))
        return movies
    }

    override fun getMovieInfo(movieName: String): MovieDetailed {
        TODO("not implemented")
    }

    override fun getNowPlayingMovies(): List<Movie> {
        val urlFormatted: String = String.format(NOW_PLAYING_MOVIES, KEY)

        var movies: List<Movie> = listOf()

        app.requestQueue.add(StringRequest(
                urlFormatted,
                {
                    val jsonStr: String = it.toString();
                    val mapper = jacksonObjectMapper()
                    val popularMoviesDto: PopularMoviesDto = mapper.readValue<PopularMoviesDto>(jsonStr)
                    movies = popularMoviesDto.PopMovDtoToMovie(popularMoviesDto)
                    for (mov: Movie in movies)
                        ResultsActivity.adapter.add(mov.title)
                },
                {
                    Log.e("Error", "Bad Request")
                }
        ))
        return movies
    }

    override fun getFilmByName(namePart: String): List<Movie> {

        val urlFormatted: String = String.format(SEARCH_MOVIES, KEY, namePart)

        var movies: List<Movie> = listOf()

        app.requestQueue.add(StringRequest(
                urlFormatted,
                {
                    val jsonStr: String = it.toString();
                    val mapper = jacksonObjectMapper()
                    val popularMoviesDto: PopularMoviesDto = mapper.readValue<PopularMoviesDto>(jsonStr)
                    movies = popularMoviesDto.PopMovDtoToMovie(popularMoviesDto)
                    for (mov: Movie in movies)
                        ResultsActivity.adapter.add(mov.title)
                },
                {
                    Log.e("Error", "Bad Request")
                }
        ))
        return movies
    }


    override fun getPopularMovies(): List<Movie> {

        val urlFormatted: String = String.format(POPULAR_MOVIES, KEY)

        var movies: List<Movie> = listOf()

        app.requestQueue.add(StringRequest(
                urlFormatted,
                {
                    val jsonStr: String = it.toString();
                    val mapper = jacksonObjectMapper()
                    val popularMoviesDto: PopularMoviesDto = mapper.readValue<PopularMoviesDto>(jsonStr)
                    movies = popularMoviesDto.PopMovDtoToMovie(popularMoviesDto)
                    for (mov: Movie in movies)
                        ResultsActivity.adapter.add(mov.title)
                },
                {
                    Log.e("Error", "Bad Request")
                }
        ))
        return movies
    }

}