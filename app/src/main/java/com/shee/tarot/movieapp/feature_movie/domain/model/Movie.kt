package com.shee.tarot.movieapp.feature_movie.domain.model

data class Movie(
    var filmId: Int?,
    var nameRu: String,
    var year: String,
    var countries: List<String>,
    var genres: List<String>,
    var posterUrl: String,
    var posterUrlPreview: String
)
