package com.shee.tarot.movieapp.feature_movie.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.shee.tarot.movieapp.feature_movie.domain.model.Movie

@Database(
    entities = [Movie::class],
    version = 1
)

abstract class MovieDB: RoomDatabase() {

    abstract val movieDao: MovieDao

    companion object {
        const val DATABASE_NAME = "saved_req_db"
    }
}