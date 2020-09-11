package com.spring.weathercast.services.impl

import com.spring.weathercast.models.WeatherRecord
import com.spring.weathercast.services.WeatherService
import okhttp3.*
import okhttp3.HttpUrl.Companion.toHttpUrl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class OpenweatherService(val httpClient: OkHttpClient = OkHttpClient()): WeatherService {

    @Autowired
    private lateinit var env: Environment

    override fun getWeatherByCity(cityName: String): Mono<String?> {
        val apikey = env.getProperty("openweather.apikey")
        val requestUrl = "https://api.openweathermap.org/data/2.5/weather".toHttpUrl().newBuilder()
                .addQueryParameter("id", cityName)
                .addQueryParameter("appid", apikey)
                .build()
        val request = Request.Builder().get().url(requestUrl).build()
        return Mono.fromCallable { httpClient.newCall(request).execute() }
                .map { it.body?.string() }
    }
}