package com.example.videoplayercompose.home

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.videoplayercompose.navbar.HomeAppBar
import com.example.videoplayercompose.repository.GamesRepositoryMockImpl
import com.example.videoplayercompose.repository.GamesSource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    openSearch: () -> Unit,
    openFilters: () -> Unit,
    homeViewModel: HomeViewModel = HomeViewModel(
        GamesSource(
            GamesRepositoryMockImpl()
        )
    )
) {
    Scaffold(topBar = {
        HomeAppBar(title = "Epic World", openSearch = { /*TODO*/ }, openFilters = {})
    },
        content = {
            GameListComponent(games = homeViewModel.getAllGames())
        })
}

@Preview(showBackground = true)
@Composable
fun previewHomeScreen() {
    HomeScreen(openSearch = {}, openFilters = {})
}
