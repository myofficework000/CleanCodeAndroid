package com.pathak.cleancodearchitecturedemo1.data.mapper

import com.pathak.cleancodearchitecturedemo1.domain.dto.DogDomain
import com.pathak.cleancodearchitecturedemo1.data.dto.DogEntity

object DogMapper : Mapper<DogEntity, DogDomain> {
    override fun mapToDomain(type: DogEntity): DogDomain {
        return DogDomain(
            urlOfDogImage = type.message,
            apiStatus = "${type.status} coming from API"
        )
    }

    override fun mapToEntity(type: DogDomain): DogEntity {
        return DogEntity(
            message = type.urlOfDogImage,
            status = type.apiStatus
        )
    }
}