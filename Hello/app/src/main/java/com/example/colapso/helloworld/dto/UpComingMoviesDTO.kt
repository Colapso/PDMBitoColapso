package com.example.colapso.helloworld.dto

/**
 * Created by Bernardo Costa on 11/10/2017.
 */
class UpComingMoviesDTO (val page: Int,
                         val results:Array<MovieResultDto>,
                         val dates: Array<DateDTO>,
                         val total_pages: Int,
                         val total_results: Int) {
}