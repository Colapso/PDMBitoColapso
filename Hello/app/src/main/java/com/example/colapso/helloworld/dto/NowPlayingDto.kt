package com.example.colapso.helloworld.dto

import com.example.colapso.helloworld.Movie
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * Created by Colapso on 24/10/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class NowPlayingDto(val page: Int,
                    val results:Array<MovieResultDto>,
                    val total_pages: Int,
                    val total_results: Int) {

    fun PopMovDtoToMovie(nowPlayingDto: NowPlayingDto) : List<Movie>
    {
        val movieListDTO : Array<MovieResultDto> = nowPlayingDto.results;
        return movieListDTO.map { it.movieResDtoToMovie()
        }
    }
}