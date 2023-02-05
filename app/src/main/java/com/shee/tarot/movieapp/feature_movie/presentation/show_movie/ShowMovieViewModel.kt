package com.shee.tarot.movieapp.feature_movie.presentation.show_movie

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shee.tarot.movieapp.feature_movie.domain.use_case.MovieUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShowMovieViewModel @Inject constructor(
    private val movieUseCases: MovieUseCases,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private var currentMovieId: Int? = null

    private val _movieTitle = mutableStateOf("")
    val movieTitle: State<String> = _movieTitle

    private val _movieDescription = mutableStateOf("")
    val movieDescription: State<String> = _movieDescription

    private val _movieGenres = mutableStateOf<List<String>>(emptyList())
    val movieGenres: State<List<String>> = _movieGenres

    private val _movieCountries = mutableStateOf<List<String>>(emptyList())
    val movieCountries: State<List<String>> = _movieCountries

    fun onEvent(event: ShowMovieEvent) {
        when(event) {

        }
    }

    init {
        savedStateHandle.get<Int>("movieId")?.let { movieId ->
            if(movieId != -1) {
                viewModelScope.launch {
                    movieUseCases.getMovie(movieId)?.also { movie ->
                        currentMovieId = movie.id
                    }
                }
            }
        }
    }
}