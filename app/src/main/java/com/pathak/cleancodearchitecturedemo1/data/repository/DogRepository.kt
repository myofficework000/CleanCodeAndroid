package com.pathak.cleancodearchitecturedemo1.data.repository

import com.pathak.cleancodearchitecturedemo1.data.api.ApiService
import com.pathak.cleancodearchitecturedemo1.data.mapper.DogMapper
import com.pathak.cleancodearchitecturedemo1.domain.repository.IDogRepository
import javax.inject.Inject

class DogRepository @Inject constructor(private val apiService: ApiService) : IDogRepository {

    override suspend fun getDog() = DogMapper.mapToDomain(apiService.getRandomDogs())
}