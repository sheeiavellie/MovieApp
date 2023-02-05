package com.shee.tarot.movieapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.shee.tarot.movieapp.R

val Roboto = FontFamily(
    Font(R.font.roboto_black, weight = FontWeight.ExtraBold),
    Font(R.font.roboto, weight = FontWeight.Normal),
)

// Set of Material typography styles to start with

val RobotoTypography = Typography(
    h1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 25.sp
    ),
    h2 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp
    ))

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)