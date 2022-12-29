package com.example.videoplayercompose.models.api

data class Record<out T>(
    val data: T?,
    val error: ErrorRecord?
)
