package com.example.videoplayercompose.data.api

data class Record<out T>(
    val data: T?,
    val error: ErrorRecord?
)
