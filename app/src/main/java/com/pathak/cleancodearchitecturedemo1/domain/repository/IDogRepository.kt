package com.pathak.cleancodearchitecturedemo1.domain.repository

import com.pathak.cleancodearchitecturedemo1.domain.dto.DogDomain

interface IDogRepository {
    suspend fun getDog(): DogDomain
}