package com.example.blogapp.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.blogapp.data.model.BlogData

@Composable
fun BlogItem(onClick : ()->Unit , item : BlogData){
    Card(modifier = Modifier
        .fillMaxWidth()
        .clickable {
            onClick.invoke()
        }
        .padding(10.dp)){
        Row(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.Blue)
            )
            Column(modifier = Modifier.fillMaxSize()) {
                Text(text = item.title?.rendered?:"UNKNOWN TITLE ")
                Text(text = item.author.toString())
            }
        }
    }
}