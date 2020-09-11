package com.spring.weathercast.entities

import org.springframework.data.annotation.Id

data class WeatherHistoryEntity(@Id val id: Long, val conditionsDescription: String) {
}