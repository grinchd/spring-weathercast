package com.spring.weathercast.config

import io.r2dbc.spi.ConnectionFactories
import io.r2dbc.spi.ConnectionFactory
import io.r2dbc.spi.ConnectionFactoryOptions
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

//@Configuration
//@EnableR2dbcRepositories
//class R2DBCConfiguration: AbstractR2dbcConfiguration() {
//    fun createConnection(): ConnectionFactory {
//        return ConnectionFactories.get(ConnectionFactoryOptions.builder())
//            .option(DRIVER, "postgresql")
//            .option(HOST, "...")
//            .option(PORT, 5432)  // optional, defaults to 5432
//            .option(USER, "...")
//            .option(PASSWORD, "...")
//            .option(DATABASE, "...")  // optional
//            .option(OPTIONS, options) // optional
//            .build())
//    }
//}