package com.shee.tarot.movieapp.feature_movie.domain.use_case

import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import com.shee.tarot.movieapp.feature_movie.domain.repository.MovieRepository
import com.shee.tarot.movieapp.feature_movie.domain.util.CategoryType
import com.shee.tarot.movieapp.feature_movie.domain.util.MovieOrder
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetMovies(
    private val repository: MovieRepository
) {

    operator fun invoke(
        movieOrder: MovieOrder = MovieOrder.Category(CategoryType.Popular)
    ): Flow<List<Movie>> {
        return repository.getMovies().map {
                movies ->
            when(movieOrder.categoryType) {

                is CategoryType.Popular -> {
                    when(movieOrder) {
                        is MovieOrder.Category -> movies.filter { !it.isFavorite }
                    }
                }
                is CategoryType.Favorite -> {
                    when(movieOrder) {
                        is MovieOrder.Category -> movies
                    }
                }
            }
        }
    }
}