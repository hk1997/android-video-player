package com.example.videoplayercompose.models.game

data class GamesEntity(
    val gamesEntities: List<GameResultEntity>
){
    constructor(): this(arrayListOf())
}
