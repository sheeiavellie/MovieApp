package com.shee.tarot.movieapp.feature_movie.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class Movie(
    val title: String,
    val description: String,
    val genres: String,
    val countries: String,
    val posterURL: String,
    val posterPreviewURL: String,
    //val isFavorite: Boolean,
    @PrimaryKey val id: Int? = null
)