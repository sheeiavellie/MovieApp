package com.shee.tarot.movieapp.feature_movie.presentation.movies.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchField() {
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(30.dp),

        value = "amogus",
        onValueChange = {},
    )
}