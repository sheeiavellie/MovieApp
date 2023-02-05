package com.shee.tarot.movieapp.feature_movie.domain.use_case

import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import com.shee.tarot.movieapp.feature_movie.domain.repository.MovieRepository

class UpdateMovie(
    private val repository: MovieRepository
) {

    suspend operator fun invoke(movie: Movie) {
        repository.updateMovie(movie)
    }
}