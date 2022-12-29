package com.example.videoplayercompose.models.api.response.common

import com.google.gson.annotations.SerializedName

data class AddedByStatus(
    @SerializedName("yet")
    val yet: Int,
    @SerializedName("owned")
    val owned: Int,
    @SerializedName("beaten")
    val beaten: Int,
    @SerializedName("toplay")
    val toPlay: Int,
    @SerializedName("dropped")
    val dropped: Int,
    @SerializedName("playing")
    val playing: Int
) {
    constructor() : this(0, 0, 0, 0, 0, 0)
}