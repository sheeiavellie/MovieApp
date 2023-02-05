package com.shee.tarot.movieapp.feature_movie.domain.util

sealed class CategoryType {
    object Favorite: CategoryType()
    object Popular: CategoryType()
}
