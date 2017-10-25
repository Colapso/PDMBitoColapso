package com.example.colapso.helloworld.dto

import com.example.colapso.helloworld.Movie
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * Created by Bernardo Costa on 11/10/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class UpComingMoviesDTO (val page: Int,
                         val results:Array<MovieResultDto>,
                         val total_pages: Int,
                         val total_results: Int) {

    fun PopMovDtoToMovie(upComingMoviesDTO: UpComingMoviesDTO) : List<Movie>
    {
        val movieListDTO : Array<MovieResultDto> = upComingMoviesDTO.results;
        return movieListDTO.map { it.movieResDtoToMovie()
        }
    }
}