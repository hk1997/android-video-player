package com.example.videoplayercompose.model.api

data class Record<out T>(
    val data: T?,
    val error: ErrorRecord?
)
