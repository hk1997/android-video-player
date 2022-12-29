package com.example.videoplayercompose.model.game

data class GamesEntity(
    val gamesEntities: List<GameResultEntity>
){
    constructor(): this(arrayListOf())
}
