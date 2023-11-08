package com.example.pocketweather.API

import com.example.pocketweather.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface APIservice {
   // @GET("forecast")
    @GET("weather/luanda")
    suspend fun getWeather():Response<Weather>

}