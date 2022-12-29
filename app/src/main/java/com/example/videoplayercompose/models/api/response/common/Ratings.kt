package com.example.videoplayercompose.models.api.response.common

import com.example.videoplayercompose.models.game.gamedetails.RatingsEntity
import com.google.gson.annotations.SerializedName

data class Ratings(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("count")
    val count: Int,
    @SerializedName("percent")
    val percent: Double
)

fun Ratings.toEntity() = RatingsEntity(id, title, count, percent)

fun List<Ratings>.toEntity() = map { it.toEntity() }