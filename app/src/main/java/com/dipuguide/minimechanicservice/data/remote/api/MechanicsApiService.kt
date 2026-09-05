package com.dipuguide.minimechanicservice.data.remote.api

import com.dipuguide.minimechanicservice.data.remote.dto.MechanicsDtoItem
import retrofit2.Response
import retrofit2.http.GET

interface MechanicsApiService {

    @GET("mechanics.json")
    fun getAllMechanics(): Response<List<MechanicsDtoItem>>

}