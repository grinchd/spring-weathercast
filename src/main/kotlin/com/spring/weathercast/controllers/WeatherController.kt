package com.spring.weathercast.controllers

import com.spring.weathercast.entities.PublicUserEntity
import com.spring.weathercast.repositories.PublicUserRepository
import com.spring.weathercast.repositories.WeatherHistoryRepository
import com.spring.weathercast.services.WeatherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class WeatherController(val weatherService: WeatherService) {
    
    @GetMapping("/weather")
    fun greeting(@RequestParam(name="cityName", required = true) cityName: String): Mono<String?> {
        return weatherService.getWeatherByCity(cityName)
    }
}