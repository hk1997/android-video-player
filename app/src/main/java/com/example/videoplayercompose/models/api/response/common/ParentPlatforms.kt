package com.example.videoplayercompose.models.api.response.common

import com.example.videoplayercompose.models.game.gamedetails.ParentPlatformsEntity
import com.google.gson.annotations.SerializedName

data class ParentPlatforms(
    @SerializedName("platform")
    val platform: Platform
)

fun ParentPlatforms.toEntity() = ParentPlatformsEntity(platform.toEntity())

fun List<ParentPlatforms>.toEntity() = map { it.toEntity() }