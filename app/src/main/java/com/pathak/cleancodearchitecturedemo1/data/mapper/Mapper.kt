package com.pathak.cleancodearchitecturedemo1.data.mapper

interface Mapper<E, D> {
    fun mapToEntity(type: D): E
    fun mapToDomain(type: E): D
}