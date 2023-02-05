package com.shee.tarot.movieapp.feature_movie.data.data_source.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class TopResponse(
    var pagesCount: Int?,
    var films: List<MovieResponse>
)