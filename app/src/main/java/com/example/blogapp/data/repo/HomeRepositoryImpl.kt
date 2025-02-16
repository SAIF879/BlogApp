package com.example.blogapp.data.repo

import android.util.Log
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
        Log.d("HomeRepository", "Fetching blogs...")

        try {
            val response = apiService.getBlogs()
            Log.d("HomeRepository", "Response received: ${response.raw()}")

            if (response.isSuccessful && response.body() != null) {
                Log.d("HomeRepository", "Blogs fetched successfully: ${response.body()}")
                emit(ApiResult.Success(response.body()!!))
            } else {
                Log.e("HomeRepository", "API Error: ${response.message()}")
                emit(ApiResult.Error("Error: ${response.message()}"))
            }
        } catch (e: Exception) {
            Log.e("HomeRepository", "Exception: ${e.message}", e)
            emit(ApiResult.Error("Exception: ${e.message}"))
        }
    }
}
