package com.shee.tarot.movieapp.feature_movie.data.repository

import com.shee.tarot.movieapp.feature_movie.data.data_source.MovieDao
import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import com.shee.tarot.movieapp.feature_movie.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow

class MovieRepositoryImpl(
    private val movieDao: MovieDao
) : MovieRepository {

    override fun getMovies(): Flow<List<Movie>> {
        return movieDao.getMovies()
    }

    override suspend fun getMovieById(id: Int): Movie? {
        return movieDao.getMovieById(id)
    }

    override suspend fun insertMovie(movie: Movie) {
        movieDao.insertMovie(movie)
    }

    override suspend fun deleteMovie(movie: Movie) {
        movieDao.deleteMovie(movie)
    }
}