package com.shee.tarot.movieapp.feature_movie.domain.util

sealed class MovieOrder(val categoryType: CategoryType) {
    class Category(categoryType: CategoryType): MovieOrder(categoryType)
}
