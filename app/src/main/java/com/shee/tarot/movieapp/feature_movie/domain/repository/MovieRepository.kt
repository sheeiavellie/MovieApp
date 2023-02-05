package com.shee.tarot.movieapp.feature_movie.domain.repository

import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun getMovies(): Flow<List<Movie>>

    suspend fun getMovieById(id: Int): Movie?

    suspend fun insertMovie(movie: Movie)

    suspend fun updateMovie(movie: Movie)
}