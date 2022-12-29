package com.example.videoplayercompose.repository

import com.example.videoplayercompose.models.api.Record
import com.example.videoplayercompose.models.game.GamesEntity

interface GamesRepository {
    suspend fun getAllGames(nextPage: Int): Record<GamesEntity>
}