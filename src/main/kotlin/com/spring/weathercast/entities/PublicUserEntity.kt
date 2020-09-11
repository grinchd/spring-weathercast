package com.spring.weathercast.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("public.user")
data class PublicUserEntity(@Id val id: Long, @Column("nickname") val nickname: String)