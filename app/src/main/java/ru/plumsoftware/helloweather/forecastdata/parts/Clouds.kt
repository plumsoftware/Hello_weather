package ru.plumsoftware.helloweather.forecastdata.parts

import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("all") var all: Int? = null
)
