package com.shee.tarot.movieapp.feature_movie.presentation.movies

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.MoviesService
import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.dto.ResponseToModelConverter
import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.dto.TopResponse
import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import com.shee.tarot.movieapp.feature_movie.domain.use_case.MovieUseCases
import com.shee.tarot.movieapp.feature_movie.domain.util.CategoryType
import com.shee.tarot.movieapp.feature_movie.domain.util.MovieCategory
import dagger.hilt.android.lifecycle.HiltViewModel
import io.ktor.client.*
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(
    private val moviesUseCases: MovieUseCases,
) : ViewModel() {

    //private var favoriteMovies: MutableList<Movie> = emptyList<Movie>() as MutableList<Movie>

    private val moviesService = MoviesService.create()

    private var getMoviesJob: Job? = null
    private val _state = mutableStateOf<MoviesState>(MoviesState())
    val state: State<MoviesState> = _state

    init {
        viewModelScope.launch { loadMovies(moviesService) }
        getMovies(MovieCategory.Category(CategoryType.Popular))
    }

    fun onEvent(event: MoviesEvent) {
        when(event) {
            is MoviesEvent.CategoryChange -> {
                if(state.value.movieCategory::class == event.movieCategory::class)
                {
                    return
                }
                getMovies(event.movieCategory)
            }
            is MoviesEvent.DeleteMovie -> {
                viewModelScope.launch {
                    moviesUseCases.deleteMovie(event.movie)
                }
            }
        }
    }

    private suspend fun loadMovies(moviesService: MoviesService) {
        val movies = moviesService.getMovies()

        ResponseToModelConverter.convert(movies).forEach { movie ->
            moviesUseCases.insertMovie(movie)
        }
    }

    private fun getMovies(movieCategory: MovieCategory) {

        getMoviesJob?.cancel()
        getMoviesJob = moviesUseCases.getMovies(movieCategory)
            .onEach { movies ->
                _state.value = state.value.copy(
                    movies = movies,
                    movieCategory = movieCategory
                )
            }
            .launchIn(viewModelScope)
    }
}