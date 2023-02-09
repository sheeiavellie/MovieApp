package com.shee.tarot.movieapp.feature_movie.data.data_source.remote.dto

import androidx.room.PrimaryKey
import com.shee.tarot.movieapp.feature_movie.domain.model.Movie

object ResponseToModelConverter {
    fun convert(response: TopResponse): List<Movie> {
        var movies = mutableListOf<Movie>()

        response.films.forEach { movieResponse ->
            var movie = Movie(
                title = movieResponse.nameRu,
                description = "",
                genres = movieResponse.genres.joinToString(separator = " ") { it.genre },
                countries = movieResponse.countries.joinToString(separator = " ") { it.country },
                posterURL = movieResponse.posterUrl,
                posterPreviewURL = movieResponse.posterUrlPreview,
                id = movieResponse.filmId
            )
            movies.add(movie)
        }
        return movies
    }
}
