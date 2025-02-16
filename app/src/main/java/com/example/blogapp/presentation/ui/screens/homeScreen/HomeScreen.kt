package com.example.blogapp.presentation.ui.screens.homeScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.blogapp.data.model.BlogData
import com.example.blogapp.data.util.ApiResult
import com.example.blogapp.presentation.ui.components.BlogItem

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(blogList: ApiResult<List<BlogData>>) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Blog List") }
            )
        },
        content = {
            when (blogList) {
                ApiResult.Loading -> {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Black),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        CircularProgressIndicator(color = Color.White)

                    }
                }

                is ApiResult.Success -> {
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Black)
                        ) {
                            blogList.data?.run {
                            items(items = this) { item ->
                                BlogItem(onClick = {

                                }, item = item)
                            }
                        }
                    }
                }


                is ApiResult.Error -> {

                }


            }
        }
    )
}