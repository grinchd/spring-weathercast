package com.spring.weathercast.services

import com.spring.weathercast.models.WeatherRecord
import reactor.core.publisher.Mono

interface WeatherService {
    fun getWeatherByCity(cityName: String): Mono<String?>
}