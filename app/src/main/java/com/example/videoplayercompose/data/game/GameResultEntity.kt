package com.example.videoplayercompose.data.game

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

data class GameResultEntity(
    val id: Int,
    val name: String,
    val backgroundImage: String,
    val rating: Double
)

@Immutable
@Stable
data class GameResultList(
    val gameResults: List<GameResultEntity>
) {
    constructor() : this(emptyList())
}
