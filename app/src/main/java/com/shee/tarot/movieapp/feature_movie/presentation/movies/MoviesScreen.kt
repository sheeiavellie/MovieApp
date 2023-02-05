package com.shee.tarot.movieapp.feature_movie.presentation.movies

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import com.shee.tarot.movieapp.ui.theme.RobotoTypography

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
                        //viewModel()
                    },

                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Movie"
                    )
                }
            }
            /*AnimatedVisibility(visible = ) {
                
            }*/
        }
    }
}