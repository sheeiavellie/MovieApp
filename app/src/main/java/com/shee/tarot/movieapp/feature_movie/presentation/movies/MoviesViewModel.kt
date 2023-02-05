package com.shee.tarot.movieapp.feature_movie.presentation.movies

import androidx.lifecycle.ViewModel
import com.shee.tarot.movieapp.feature_movie.domain.use_case.MovieUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(
    private val moviesUseCases: MovieUseCases
) : ViewModel() {


}