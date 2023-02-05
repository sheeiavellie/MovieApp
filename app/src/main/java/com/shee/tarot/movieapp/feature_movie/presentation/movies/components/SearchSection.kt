package com.shee.tarot.movieapp.feature_movie.presentation.movies.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shee.tarot.movieapp.ui.theme.ButtonBlueBlue

@Composable
fun SearchSection(
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth(0.1f)
                .padding(5.dp)
                //.background(Color.Cyan),
        ) {
            IconButton(
                onClick = {

                }
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
        }
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp)
                //.background(Color.Magenta)
        ) {
            SearchField()
        }
    }

}