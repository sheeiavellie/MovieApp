package com.shee.tarot.movieapp.di

import android.app.Application
import androidx.room.Room
import com.shee.tarot.movieapp.feature_movie.data.data_source.MovieDB
import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.MoviesService
import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.MoviesServiceImpl
import com.shee.tarot.movieapp.feature_movie.data.repository.MovieRepositoryImpl
import com.shee.tarot.movieapp.feature_movie.domain.repository.MovieRepository
import com.shee.tarot.movieapp.feature_movie.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
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
            getMovie = GetMovie(repository),
            insertMovie = InsertMovie(repository)
        )
    }
}