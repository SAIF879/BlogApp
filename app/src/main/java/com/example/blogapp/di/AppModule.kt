package com.example.blogapp.di

import com.example.blogapp.data.repo.HomeRepositoryImpl
import com.example.blogapp.data.source.remote.ApiService
import com.example.blogapp.data.util.OkHttpClientHelper
import com.example.blogapp.domain.repo.HomeRepository
import com.pierfrancescosoffritti.androidyoutubeplayer.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideAnimeApi(): ApiService {
        val BASE_URL = "https://blog.vrid.in/wp-json/wp/"
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(OkHttpClientHelper().getOkHttpClient())
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }



    @Singleton
    @Provides
    fun providesGetBlogRepository(apiServices: ApiService): HomeRepository {
        return HomeRepositoryImpl(apiServices)
    }


}
