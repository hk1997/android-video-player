package com.example.videoplayercompose.repository

import com.example.videoplayercompose.model.api.Record
import com.example.videoplayercompose.model.game.GameResultEntity
import com.example.videoplayercompose.model.game.GamesEntity

class GamesRepositoryMockImpl : GamesRepository {
    override suspend fun getAllGames(nextPage: Int): Record<GamesEntity> =
        Record<GamesEntity>(
            data =
            GamesEntity(
                listOf(
                    GameResultEntity(id = 1, name = "game1", backgroundImage = "", rating = 2.0),
                    GameResultEntity(id = 2, name = "game2", backgroundImage = "", rating = 2.0),
                    GameResultEntity(id = 3, name = "game3", backgroundImage = "", rating = 2.0),
                    GameResultEntity(id = 4, name = "game4", backgroundImage = "", rating = 2.0),
                    GameResultEntity(id = 5, name = "game5", backgroundImage = "", rating = 2.0),
                    GameResultEntity(id = 6, name = "game6", backgroundImage = "", rating = 2.0),
                )
            ),
            error = null
        )
}