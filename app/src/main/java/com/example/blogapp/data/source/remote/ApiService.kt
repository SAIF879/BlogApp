package com.example.blogapp.data.source.remote

import com.example.blogapp.data.model.BlogData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService{

    @GET("v2/posts")
    suspend fun getBlogs(
        @Query("per_page") perPage: Int = 10,
        @Query("page") page: Int = 1
    ): Response<List<BlogData>>
}