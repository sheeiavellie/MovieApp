package com.shee.tarot.movieapp.feature_movie.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movie(
    val title: String,
    val description: String,
    //val genres: List<String>,
    //val countries: List<String>,
    val posterURL: String,
    val posterPreviewURL: String,
    var isFavorite: Boolean,
    @PrimaryKey val id: Int? = null
)
