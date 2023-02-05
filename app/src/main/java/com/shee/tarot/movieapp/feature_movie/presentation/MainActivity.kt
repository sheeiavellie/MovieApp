package com.shee.tarot.movieapp.feature_movie.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.MoviesService

import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.dto.TopResponse
import com.shee.tarot.movieapp.feature_movie.presentation.movies.MoviesScreen
import com.shee.tarot.movieapp.feature_movie.presentation.movies.components.DefaultCategoryButton
import com.shee.tarot.movieapp.feature_movie.presentation.movies.components.MovieItem
import com.shee.tarot.movieapp.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}