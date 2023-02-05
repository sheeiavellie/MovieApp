package com.shee.tarot.movieapp.feature_movie.presentation.movies

import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import com.shee.tarot.movieapp.feature_movie.domain.util.CategoryType
import com.shee.tarot.movieapp.feature_movie.domain.util.MovieCategory

data class MoviesState(
    val movies: List<Movie> = emptyList(),
    val movieCategory: MovieCategory = MovieCategory.Category(CategoryType.Popular),
    val isSearchSectionVisible: Boolean = false
)
