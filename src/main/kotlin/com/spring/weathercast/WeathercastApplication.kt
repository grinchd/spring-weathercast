package com.spring.weathercast

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WeathercastApplication

fun main(args: Array<String>) {
	runApplication<WeathercastApplication>(*args)
}
