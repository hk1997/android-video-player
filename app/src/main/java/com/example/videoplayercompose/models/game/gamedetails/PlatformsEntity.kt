package com.example.videoplayercompose.models.game.gamedetails

data class PlatformsEntity(
    val platform: PlatformEntity,
    val releasedAt: String?,
    val requirementsEn: RequirementsEntity?,
    val requirementsRu: RequirementsEntity?
)