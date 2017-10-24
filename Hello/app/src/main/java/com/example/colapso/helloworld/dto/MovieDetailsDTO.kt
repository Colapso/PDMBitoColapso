package com.example.colapso.helloworld.dto

/**
 * Created by Bernardo Costa on 11/10/2017.
 */
class MovieDetailsDTO (val adult: Boolean,
                       val backdrop_path: String?,
                       val belongs_to_collection: CollectionDTO,
                       val budget: Int,
                       val genres: Array<GenreDTO>,
                       val homepage: String?,
                       val id: Int,
                       val imdb_id: String?,
                       val original_language: String,
                       val original_title: String,
                       val overview: String?,
                       val popularity: Int,
                       val poster_path: String?,
                       val production_companies: Array<CompanyDTO>,
                       val production_countries: Array<CountryDTO>,
                       val release_date: String,
                       val revenue: Int,
                       val runtime: Int?,
                       val spoken_languages: Array<LanguageDTO>,
                       val status: String,
                       val tagline: String?,
                       val video: Boolean,
                       val vote_average: Double,
                       val vote_count: Int) {
}