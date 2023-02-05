package com.shee.tarot.movieapp.feature_movie.data.data_source.remote

object HttpRoutes {

    private const val BASE_URL = "https://kinopoiskapiunofficial.tech"
    const val MOVIES_TOP = "$BASE_URL/api/v2.2/films/top?type=TOP_100_POPULAR_FILMS&page=1"

    const val KEY = "X-API-KEY"
    const val KEY_VALUE = "8fac5f4c-aff3-4a96-921d-ac21f15166a5"
}