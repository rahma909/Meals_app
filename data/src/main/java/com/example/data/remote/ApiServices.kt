package com.example.data.remote

import com.example.domain.entity.categoryRespons
import retrofit2.http.GET

interface ApiServices {
    @GET("categories.php")
    fun getMeals():categoryRespons
}