package com.example.videoplayercompose.models.api.response.common

import com.example.videoplayercompose.models.game.gamedetails.PlatformEntity
import com.google.gson.annotations.SerializedName

data class Platform(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("image")
    val image: String?,
    @SerializedName("year_end")
    val yearEnd: String?,
    @SerializedName("year_start")
    val yearStart: String?,
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("image_background")
    val imageBackground: String?
)

fun Platform.toEntity() =
    PlatformEntity(id, name, slug, image, yearEnd, yearStart, gamesCount, imageBackground)