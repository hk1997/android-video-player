package com.example.videoplayercompose.models.game.gamedetails

data class RequirementsEntity(
    val minimum: String?,
    val recommended: String?
) {
    constructor() : this("", "")
}