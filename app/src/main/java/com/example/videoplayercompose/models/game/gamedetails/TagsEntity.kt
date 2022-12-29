package com.example.videoplayercompose.models.game.gamedetails

data class TagsEntity(
    val id: Int,
    val name: String,
    val slug: String,
    val language: String,
    val gamesCount: Int,
    val imageBackground: String
)