package com.dipuguide.minimechanicservice.data.remote.dto

import com.google.gson.annotations.SerializedName

data class MechanicsDtoItem(
    val id: String,
    @SerializedName("garage_name") val garageName: String,
    val address: String,
    val distance: String,
    val location: String,
    val phone: String,
    val rating: Double,
    val services: List<String>,
    @SerializedName("is_open") val isOpen: Boolean,
    @SerializedName("working_hours") val workingHours: String,
)