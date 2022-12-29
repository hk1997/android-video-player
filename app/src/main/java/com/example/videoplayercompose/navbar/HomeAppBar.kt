package com.example.videoplayercompose.navbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeAppBar(title: String,
               openSearch: ()-> Unit,
               openFilters: ()-> Unit){
    SmallTopAppBar(title = {
        Text(text = title, color = Color.White)
    },
    actions = {
        IconButton(onClick = { openSearch }) {
            Icon(imageVector = Icons.Filled.Search,
                contentDescription = "Search",
            tint = Color.White)
        }

        IconButton(onClick = { openFilters }) {
            Icon(imageVector = Icons.Filled.List,
                contentDescription = "Filter",
                tint = Color.White)
        }
    },
    colors = TopAppBarDefaults.smallTopAppBarColors(
        containerColor = Color(0xFFF50057)
    )
        )
}

@Preview(showBackground = true)
@Composable
fun HomeAppBarPreview() {
    HomeAppBar(
        title = "EpicWorld",
        openSearch = {},
        openFilters = {}
    )
}