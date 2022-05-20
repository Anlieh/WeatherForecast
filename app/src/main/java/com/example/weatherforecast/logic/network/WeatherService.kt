package com.example.weatherforecast.logic.network

import com.example.weatherforecast.application.MyApplication
import com.example.weatherforecast.logic.model.DailyResponse
import com.example.weatherforecast.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

//    @GET("v2.6/${MyApplication.TOKEN}/{lng},{lat}/realtime.json")
    @GET("v2.6/${MyApplication.TOKEN}/{lng},{lat}/realtime")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<RealtimeResponse>


    @GET("v2.6/${MyApplication.TOKEN}/{lng},{lat}/daily")
    fun getDailyWeather(@Path("lng") lng: String,
                        @Path("lat") lat: String):
            Call<DailyResponse>

    @GET("v2.6/${MyApplication.TOKEN}/{lng},{lat}/daily?{dailysteps}")
    fun getDailyStepsWeather(@Path("lng") lng: String,
                        @Path("lat") lat: String,
                        @Path("dailysteps") dailysteps: Int = 1):
            Call<DailyResponse>
}