package com.shivamkumarjha.pokedex.model

import com.google.gson.annotations.SerializedName

data class Silver(
    @SerializedName("back_default") val back_default: String,
    @SerializedName("back_shiny") val back_shiny: String,
    @SerializedName("front_default") val front_default: String,
    @SerializedName("front_shiny") val front_shiny: String
)