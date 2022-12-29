package com.example.videoplayercompose.models.api.response.common

import com.example.videoplayercompose.models.game.gamedetails.PlatformsEntity
import com.google.gson.annotations.SerializedName

data class Platforms(
    @SerializedName("platform")
    val platform: Platform,
    @SerializedName("released_at")
    val releasedAt: String?,
    @SerializedName("requirements_en")
    val requirementsEn: Requirements?,
    @SerializedName("requirements_ru")
    val requirementsRu: Requirements?
)

fun Platforms.toEntity() = PlatformsEntity(
    platform.toEntity(),
    releasedAt,
    requirementsEn?.toEntity(),
    requirementsRu?.toEntity()
)

fun List<Platforms>.toEntity() = map { it.toEntity() }