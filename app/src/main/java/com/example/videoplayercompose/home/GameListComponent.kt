package com.example.videoplayercompose.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.paging.PagingData
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.videoplayercompose.models.game.GameResultEntity

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GameListComponent(games: kotlinx.coroutines.flow.Flow<PagingData<GameResultEntity>>) {
    val lazyGameItems = games.collectAsLazyPagingItems()

    LazyVerticalGrid(cells = GridCells.Fixed(2), content = {
        items(lazyGameItems.itemCount) {

                index ->
            lazyGameItems[index]?.let {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = it.name,
                    color = Color.Black
                )
            }
        }
    })
}