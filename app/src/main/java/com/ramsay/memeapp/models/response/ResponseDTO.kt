package com.ramsay.memeapp.models.response


import com.google.gson.annotations.SerializedName

data class ResponseDTO(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("success")
    val success: Boolean
)