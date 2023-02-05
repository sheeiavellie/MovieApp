package com.shee.tarot.movieapp.feature_movie.presentation.movies

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.progressSemantics
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.shee.tarot.movieapp.feature_movie.presentation.movies.components.MovieItem
import com.shee.tarot.movieapp.feature_movie.presentation.movies.components.SearchSection
import com.shee.tarot.movieapp.ui.theme.RobotoTypography

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MoviesScreen(
    navController: NavController,
    viewModel: MoviesViewModel = hiltViewModel()
) {

    val state = viewModel.state.value
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {

                },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add movie")
            }
        },
        scaffoldState = scaffoldState
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Popular",
                    style = RobotoTypography.h1
                )
                IconButton(
                    onClick = {
                        viewModel.onEvent(MoviesEvent.ToggleSearchSection)
                    },

                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Movie"
                    )
                }
            }
            AnimatedVisibility(
                visible = state.isSearchSectionVisible,
                enter = fadeIn() + slideInHorizontally(),
                exit = fadeOut() + slideOutHorizontally()
            ) {
                SearchSection(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(state.movies) { movie ->
                    MovieItem(
                        movie = movie,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {

                            },
                        onPutInFavoriteMovieClick = {
                            //viewModel.onEvent()
                        }
                    )
                }
            }
        }
    }
}