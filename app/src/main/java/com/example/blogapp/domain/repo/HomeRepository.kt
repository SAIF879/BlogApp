package com.example.blogapp.domain.repo

import com.example.blogapp.data.model.BlogData
import com.example.blogapp.data.util.ApiResult
import kotlinx.coroutines.flow.Flow

interface HomeRepository{
    suspend fun getBlogs() : Flow<ApiResult<List<BlogData>>>
}