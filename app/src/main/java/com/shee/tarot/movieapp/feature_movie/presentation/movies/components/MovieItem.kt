package com.shee.tarot.movieapp.feature_movie.presentation.movies.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import com.shee.tarot.movieapp.feature_movie.domain.model.Movie
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.shee.tarot.movieapp.ui.theme.Typography
import com.shee.tarot.movieapp.ui.theme.LightGrey
import com.shee.tarot.movieapp.ui.theme.RobotoTypography

@Composable
fun MovieItem (
    movie: Movie,
    modifier: Modifier = Modifier,
    onPutInFavoriteMovieClick: () -> Unit
) {
    
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 10.dp
    ) {
        
        Box() {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier.height(110.dp)) {
                    Image(
                        painter = painterResource(id = com.shee.tarot.movieapp.R.drawable.poster),
                        contentDescription = "amogus",
                        contentScale  = ContentScale.Crop,
                        modifier = Modifier
                            .padding(10.dp)
                            .aspectRatio(2f / 3f)
                            .clip(RoundedCornerShape(8.dp))
                    )
                }
                Column(
                    modifier = Modifier.padding(15.dp),
                ) {
                    Text(
                        text = "Star Wars: Episode III",
                        style = RobotoTypography.h1
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "sdfgiojslfjkds;fdsfsfd",
                        style = RobotoTypography.h2,
                        color = LightGrey
                    )
                }
            }
        }
    }

}