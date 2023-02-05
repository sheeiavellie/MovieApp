package com.shee.tarot.movieapp.feature_movie.domain.util

sealed class MovieCategory(val categoryType: CategoryType) {
    class Category(categoryType: CategoryType): MovieCategory(categoryType)
}
