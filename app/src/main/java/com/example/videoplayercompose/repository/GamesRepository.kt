package com.example.videoplayercompose.repository

import com.example.videoplayercompose.model.api.Record
import com.example.videoplayercompose.model.game.GamesEntity

interface GamesRepository {
    suspend fun getAllGames(nextPage: Int): Record<GamesEntity>
}