package com.shee.tarot.movieapp.feature_movie.presentation.util

sealed class Screen(val route: String) {
    object MoviesScreen: Screen("movies_screen")
    object ShowMovieScreen: Screen("show_movie_screen")
}
