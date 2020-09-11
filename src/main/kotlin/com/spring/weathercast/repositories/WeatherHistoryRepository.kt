package com.spring.weathercast.repositories

import com.spring.weathercast.entities.WeatherHistoryEntity
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface WeatherHistoryRepository: ReactiveCrudRepository<WeatherHistoryEntity, Long> {
}