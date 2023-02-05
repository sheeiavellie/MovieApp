package com.shee.tarot.movieapp.feature_movie.presentation.movies

import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import com.shee.tarot.movieapp.feature_movie.domain.util.CategoryType
import com.shee.tarot.movieapp.feature_movie.domain.util.MovieOrder

data class MoviesState(
    val movies: List<Movie> = emptyList(),
    val movieOrder: MovieOrder = MovieOrder.Category(CategoryType.Popular),
    val isOrderControlsVisible: Boolean = true
)
