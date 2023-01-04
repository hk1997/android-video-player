package com.example.videoplayercompose.models.api

import com.example.videoplayercompose.models.api.request.GetAllGamesRequest
import com.example.videoplayercompose.models.api.response.getallgames.GetAllGamesResponse

interface RestApi {
    suspend fun getAllGames(getAllGamesRequest: GetAllGamesRequest): GetAllGamesResponse
}