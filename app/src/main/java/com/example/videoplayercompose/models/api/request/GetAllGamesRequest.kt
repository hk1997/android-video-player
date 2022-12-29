package com.example.videoplayercompose.models.api.request

import com.example.videoplayercompose.models.api.ApiConstants

data class GetAllGamesRequest(
    val nextPage: Int,
    val pageSize: Int = ApiConstants.PAGE_SIZE
)