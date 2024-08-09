package com.pathak.cleancodearchitecturedemo1.data.api

import com.pathak.cleancodearchitecturedemo1.data.api.Constant.END_POINT
import com.pathak.cleancodearchitecturedemo1.data.dto.DogEntity
import retrofit2.http.GET

interface ApiService {

    @GET(END_POINT)
    suspend fun getRandomDogs(): DogEntity
}