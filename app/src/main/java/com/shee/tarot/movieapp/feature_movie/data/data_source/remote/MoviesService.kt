package com.shee.tarot.movieapp.feature_movie.data.data_source.remote

import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.dto.MovieResponse

import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.dto.TopResponse
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.auth.*
import io.ktor.client.features.auth.providers.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import kotlinx.serialization.json.JsonBuilder

interface MoviesService {

    suspend fun getMovies(): TopResponse

    companion object {
        fun create(): MoviesService {
            return MoviesServiceImpl(
                client = HttpClient(Android) {
                    install(Logging) {
                        level = LogLevel.ALL
                    }
                    install(JsonFeature) {
                        serializer = KotlinxSerializer(json = kotlinx.serialization.json.Json {
                            isLenient = true
                            ignoreUnknownKeys = true
                        })
                    }
                }
            )
        }
    }
}