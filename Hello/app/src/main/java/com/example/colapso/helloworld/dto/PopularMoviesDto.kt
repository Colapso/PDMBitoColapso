package com.example.colapso.helloworld.dto

import com.example.colapso.helloworld.Movie
import com.example.colapso.helloworld.MovieDetailed

/**
 * Created by Bernardo Costa on 10/10/2017.
 */
class PopularMoviesDto(val page: Int,
                       val results: Array<MovieResultDto>,
                       val total_results: Int,
                       val total_pages: Int) {

    fun PopMovDtoToMovie(popularMoviesDto: PopularMoviesDto) : List<Movie> {
        val movieListDTO : Array<MovieResultDto> = popularMoviesDto.results;
        return movieListDTO.map { it.movieResDtoToMovie() }
    }
}