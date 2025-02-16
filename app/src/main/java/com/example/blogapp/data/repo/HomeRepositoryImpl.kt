package com.example.blogapp.data.repo

import com.example.blogapp.data.model.BlogData
import com.example.blogapp.data.source.remote.ApiService
import com.example.blogapp.data.util.ApiResult
import com.example.blogapp.domain.repo.HomeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(private val apiService: ApiService) : HomeRepository {

    override suspend fun getBlogs(): Flow<ApiResult<List<BlogData>>> = flow {

        emit(ApiResult.Loading)
        val response = apiService.getBlogs()

        if (response.isSuccessful && response.body() != null) {
            emit(ApiResult.Success(response.body()!!))
        } else {
            emit(ApiResult.Error("Error: ${response.message()}"))
        }
    }
}
