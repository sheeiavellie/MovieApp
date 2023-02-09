package com.shee.tarot.movieapp.feature_movie.data.data_source

import androidx.room.*
import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {

    @Query("SELECT * FROM movies")
    fun getMovies(): Flow<List<Movie>>

    @Query("SELECT * FROM movies WHERE id = :id")
    suspend fun getMovieById(id: Int): Movie?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: Movie)

    @Delete
    suspend fun deleteMovie(movie: Movie)
}