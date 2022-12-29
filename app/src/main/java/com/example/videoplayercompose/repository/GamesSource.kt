package com.example.videoplayercompose.repository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.videoplayercompose.models.game.GameResultEntity


class GamesSource(
    private val gamesRepository: GamesRepository
) : PagingSource<Int, GameResultEntity>() {
    override fun getRefreshKey(state: PagingState<Int, GameResultEntity>): Int? =
        state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, GameResultEntity> {
        val nextPage = params.key ?: 1
        val gamesResponse = gamesRepository.getAllGames(nextPage)
        return if (gamesResponse.data == null) {
            LoadResult.Error(Exception(gamesResponse.error.toString()))
        } else {
            LoadResult.Page(
                data = gamesResponse.data.gamesEntities,
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = nextPage.plus(1)
            )
        }
    }

}