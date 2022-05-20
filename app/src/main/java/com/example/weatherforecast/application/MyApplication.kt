package com.example.weatherforecast.application

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MyApplication: Application(){

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "uD3ZqHJt8MciXYr8"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}