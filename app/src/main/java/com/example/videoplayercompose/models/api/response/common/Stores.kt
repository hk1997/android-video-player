package com.example.videoplayercompose.models.api.response.common

import com.example.videoplayercompose.models.game.gamedetails.StoresEntity
import com.google.gson.annotations.SerializedName

data class Stores(
    @SerializedName("id")
    val id: Int,
    @SerializedName("store")
    val store: Store
)

fun Stores.toEntity() = StoresEntity(id, store.toEntity())

fun List<Stores>.toEntity() = map { it.toEntity() }