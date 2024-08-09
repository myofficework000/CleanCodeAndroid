package com.pathak.cleancodearchitecturedemo1.data.dto

import com.google.gson.annotations.SerializedName

data class DogEntity(
    @SerializedName("message") val message: String,
    @SerializedName("status") val status: String
)