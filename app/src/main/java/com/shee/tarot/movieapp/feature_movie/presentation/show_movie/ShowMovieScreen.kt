package com.shee.tarot.movieapp.feature_movie.presentation.show_movie

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.shee.tarot.movieapp.R
import com.shee.tarot.movieapp.ui.theme.ButtonBlueBlue

@Composable
fun ShowMovieScreen(
    navController: NavController,
    viewModel: ShowMovieViewModel = hiltViewModel()
) {

    val titleState = viewModel.movieTitle.value
    val descriptionState = viewModel.movieDescription.value
    val genresState = viewModel.movieGenres.value
    val countriesState = viewModel.movieCountries.value

    val scaffoldState = rememberScaffoldState()

    val scope = rememberCoroutineScope()
    
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    viewModel.onEvent(ShowMovieEvent.GoBack)
                },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(
                    modifier = Modifier
                        .size(30.dp)
                        .clip(RoundedCornerShape(15.dp)),
                    imageVector = Icons.Default.ArrowBack,
                    tint = ButtonBlueBlue,
                    contentDescription = "Back",
                )
            }
        },
        scaffoldState = scaffoldState
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.poster),
                contentDescription = "",
                contentScale  = ContentScale.Crop,
                modifier = Modifier
                    .aspectRatio(2f / 3f)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3f),
            verticalArrangement = Arrangement.Center

            ) {
            Text(
                text = "qwerty323432uio"
            )
            Text(
                text = "qwerty4324234uio"
            )
            Text(
                text = "qwertysdfsduio"
            )
            Text(
                text = "qwert3242yuio"
            )
        }
    }
}