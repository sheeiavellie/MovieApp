package com.shee.tarot.movieapp.feature_movie.presentation.movies

import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import com.shee.tarot.movieapp.feature_movie.domain.util.MovieCategory

sealed class MoviesEvent {

    data class CategoryChange(val movieCategory: MovieCategory): MoviesEvent()
    data class DeleteMovie(val movie: Movie): MoviesEvent()
    data class PutInFavoriteMovie(val movie: Movie): MoviesEvent()
    data class PutOutFavoriteMovie(val movie: Movie): MoviesEvent()
    object ToggleSearchSection: MoviesEvent()
}
