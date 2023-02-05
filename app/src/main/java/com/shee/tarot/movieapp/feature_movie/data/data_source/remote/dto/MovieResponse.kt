package com.shee.tarot.movieapp.feature_movie.data.data_source.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class MovieResponse(
    var filmId: Int,
    var nameRu: String,
    var year: String,
    var countries: List<Country>,
    var genres: List<Genre>,
    var posterUrl: String,
    var posterUrlPreview: String,
) {
    @Serializable
    data class Country(
        var country: String
    )
    @Serializable
    data class Genre(
        var genre: String
    )
}