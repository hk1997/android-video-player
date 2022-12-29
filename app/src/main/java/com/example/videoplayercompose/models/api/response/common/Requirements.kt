package com.example.videoplayercompose.models.api.response.common

import com.example.videoplayercompose.models.game.gamedetails.RequirementsEntity
import com.google.gson.annotations.SerializedName

data class Requirements(
    @SerializedName("minimum")
    val minimum: String?,
    @SerializedName("recommended")
    val recommended: String?
)

fun Requirements.toEntity() = RequirementsEntity(minimum, recommended)