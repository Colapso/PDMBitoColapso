package com.example.colapso.helloworld.dto

import com.example.colapso.helloworld.Movie
import com.example.colapso.helloworld.MovieDetailed

/**
 * Created by Bernardo Costa on 11/10/2017.
 */
class MovieResultDto(val poster_path: String?,
                     val adult: Boolean,
                     val overview: String,
                     val release_date: String,
                     val genre_ids: Array<Int>,
                     val id: Int,
                     val original_title: String,
                     val original_language: String,
                     val title: String,
                     val backdrop_path: String?,
                     val popularity: Double,
                     val vote_count: Int,
                     val video: Boolean,
                     val vote_average: Int) {


    fun movieResDtoToMovie() : Movie {
        val genres : String = genre_ids.joinToString()
        return Movie(overview,release_date, genres,original_title, original_language,title,popularity, vote_count, vote_average)
    }

}