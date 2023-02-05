package com.shee.tarot.movieapp.di

import android.app.Application
import androidx.room.Room
import com.shee.tarot.movieapp.feature_movie.data.data_source.MovieDB
import com.shee.tarot.movieapp.feature_movie.data.repository.MovieRepositoryImpl
import com.shee.tarot.movieapp.feature_movie.domain.repository.MovieRepository
import com.shee.tarot.movieapp.feature_movie.domain.use_case.GetMovies
import com.shee.tarot.movieapp.feature_movie.domain.use_case.MovieUseCases
import com.shee.tarot.movieapp.feature_movie.domain.use_case.DeleteMovie
import com.shee.tarot.movieapp.feature_movie.domain.use_case.GetMovie
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMovieDB(app: Application): MovieDB {

        return Room.databaseBuilder(
            app,
            MovieDB::class.java,
            MovieDB.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideMovieRepository(db: MovieDB): MovieRepository {

        return MovieRepositoryImpl(db.movieDao)
    }

    @Provides
    @Singleton
    fun provideMovieUseCases(repository: MovieRepository): MovieUseCases {

        return MovieUseCases(
            getMovies = GetMovies(repository),
            deleteMovie = DeleteMovie(repository),
            getMovie = GetMovie(repository)
        )
    }
}