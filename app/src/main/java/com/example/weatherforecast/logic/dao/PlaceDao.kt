package com.example.weatherforecast.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.example.weatherforecast.application.MyApplication
import com.example.weatherforecast.logic.model.Place
import com.google.gson.Gson

object PlaceDao {

    private val  sharedPreferences = MyApplication.context.
        getSharedPreferences("weather", Context.MODE_PRIVATE)

    fun savePlace(place: Place) {
       sharedPreferences.edit {
           putString("place", Gson().toJson(place))
       }
    }

    fun getPlace(): Place{
        val placeJson = sharedPreferences.getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isSaved() = sharedPreferences.contains("place")

}