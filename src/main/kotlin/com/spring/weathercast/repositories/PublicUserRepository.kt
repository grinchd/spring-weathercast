package com.spring.weathercast.repositories

import com.spring.weathercast.entities.PublicUserEntity
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface PublicUserRepository: ReactiveCrudRepository<PublicUserEntity, Long> {
}