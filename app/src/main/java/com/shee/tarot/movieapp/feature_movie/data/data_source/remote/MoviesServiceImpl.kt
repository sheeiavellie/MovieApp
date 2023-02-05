package com.shee.tarot.movieapp.feature_movie.data.data_source.remote

import android.app.Application
import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.dto.MovieResponse
import com.shee.tarot.movieapp.feature_movie.data.data_source.remote.dto.TopResponse
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.request.*
import io.ktor.http.*

class MoviesServiceImpl(
    private val client: HttpClient
) : MoviesService {

    override suspend fun getMovies(): TopResponse {
        return try {
            client.get {
                url(HttpRoutes.MOVIES_TOP)
                header(HttpRoutes.KEY, HttpRoutes.KEY_VALUE)
            }
        } catch (e: RedirectResponseException) {
            println("Error: ${e.response.status.description}")
            TopResponse(null, emptyList())
        } catch (e: ClientRequestException) {
            println("Error: ${e.response.status.description}")
            TopResponse(null, emptyList())
        } catch (e: Exception) {
            println("Error: ${e.message}")
            TopResponse(null, emptyList())
        }
    }
}