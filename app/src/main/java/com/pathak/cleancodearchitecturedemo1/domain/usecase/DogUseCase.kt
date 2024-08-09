package com.pathak.cleancodearchitecturedemo1.domain.usecase

import com.pathak.cleancodearchitecturedemo1.data.repository.DogRepository
import javax.inject.Inject

class DogUseCase @Inject constructor(private val dogRepository: DogRepository) {
    suspend operator fun invoke() = dogRepository.getDog()
}