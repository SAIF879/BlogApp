package com.example.blogapp.domain.usecases

import com.example.blogapp.data.model.BlogData
import com.example.blogapp.data.util.ApiResult
import com.example.blogapp.domain.repo.HomeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetBlogUseCase @Inject constructor(private val repository: HomeRepository)  {
    suspend operator fun invoke() : Flow<ApiResult<List<BlogData>>> = repository.getBlogs()
}