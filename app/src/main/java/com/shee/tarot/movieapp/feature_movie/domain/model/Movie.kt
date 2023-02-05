package com.shee.tarot.movieapp.feature_movie.domain.model

data class Movie(
    val title: String,
    val description: String,
    val genres: List<String>,
    val countries: List<String>,
    val posterURL: String,
    val posterPreviewURL: String,
    val isFavorite: Boolean = false
)
