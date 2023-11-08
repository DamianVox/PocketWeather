package com.example.pocketweather.data

data class WeatherData (
    val elevation: Long,
    val generationtimeMS: Double,
    val timezoneAbbreviation: String,
    val dailyUnits: DailyUnits,
    val timezone: String,
    val latitude: Double,
    val daily: Daily,
    val utcOffsetSeconds: Long,
    val longitude: Double
)

data class Daily (
    val snowfallSum: List<Long>,
    val temperature2MMax: List<Double>,
    val temperature2MMin: List<Double>,
    val rainSum: List<Double>,
    val time: List<String>,
    val showersSum: List<Double>,
    val weatherCode: List<Long>,
    val precipitationSum: List<Double>
)

data class DailyUnits (
    val snowfallSum: String,
    val temperature2MMax: String,
    val temperature2MMin: String,
    val rainSum: String,
    val time: String,
    val showersSum: String,
    val weatherCode: String,
    val precipitationSum: String
)
