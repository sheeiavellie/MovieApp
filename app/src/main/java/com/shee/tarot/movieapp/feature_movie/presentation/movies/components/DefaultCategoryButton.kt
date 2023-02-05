package com.shee.tarot.movieapp.feature_movie.presentation.movies.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.shee.tarot.movieapp.ui.theme.ButtonBlueBlue
import com.shee.tarot.movieapp.ui.theme.ButtonLightBlue
import com.shee.tarot.movieapp.ui.theme.White

@Composable
fun DefaultCategoryButton(
    text: String,
    type: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    var backgroundColor = ButtonBlueBlue
    var contentColor = White

    if(type == "Popular")
    {
        backgroundColor = ButtonLightBlue
        contentColor = ButtonBlueBlue
    }

    Button(
        onClick = {},
        modifier = modifier.fillMaxWidth(0.5f),
        shape = CircleShape,
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        elevation = ButtonDefaults.elevation(0.dp, 0.dp),
        contentPadding = PaddingValues(20.dp, 20.dp)
    ) {
        Text(text = text)
    }
}
