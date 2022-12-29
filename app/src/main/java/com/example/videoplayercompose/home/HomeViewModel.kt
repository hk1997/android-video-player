package com.example.videoplayercompose.home

import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.videoplayercompose.model.game.GameResultEntity
import com.example.videoplayercompose.repository.GamesSource

class HomeViewModel(private val gamesSource: GamesSource) : ViewModel() {

    fun getAllGames(): kotlinx.coroutines.flow.Flow<PagingData<GameResultEntity>> {
        return Pager(PagingConfig(PAGE_SIZE)) { gamesSource }.flow
    }

    companion object {
        private const val PAGE_SIZE = 50
    }
}