package com.shee.tarot.movieapp.feature_movie.domain.use_case

import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import com.shee.tarot.movieapp.feature_movie.domain.repository.MovieRepository
import com.shee.tarot.movieapp.feature_movie.domain.util.CategoryType
import com.shee.tarot.movieapp.feature_movie.domain.util.MovieCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetMovies(
    private val repository: MovieRepository
) {

    operator fun invoke(
        movieCategory: MovieCategory = MovieCategory.Category(CategoryType.Popular)
    ): Flow<List<Movie>> {
        return repository.getMovies().map { movies ->
            when(movieCategory.categoryType) {

                is CategoryType.Popular -> {
                    when(movieCategory) {
                        is MovieCategory.Category -> movies.filter { !it.isFavorite }
                    }
                }
                is CategoryType.Favorite -> {
                    when(movieCategory) {
                        is MovieCategory.Category -> movies
                    }
                }
            }
        }
    }
}