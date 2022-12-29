package com.example.videoplayercompose.data.game

data class GamesEntity(
    val gamesEntities: List<GameResultEntity>
){
    constructor(): this(arrayListOf())
}
