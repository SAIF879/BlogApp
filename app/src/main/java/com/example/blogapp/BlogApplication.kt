package com.example.blogapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BlogApplication : Application() {

    companion object{
        @JvmStatic
        var instance :BlogApplication?= null
    }

    override fun onCreate() {
        super.onCreate()
        instance=this
    }

}