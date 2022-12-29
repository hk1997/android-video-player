package com.example.videoplayercompose.repository

import com.example.videoplayercompose.data.api.Record
import com.example.videoplayercompose.data.game.GamesEntity

interface GamesRepository {
    suspend fun getAllGames(nextPage: Int): Record<GamesEntity>
}