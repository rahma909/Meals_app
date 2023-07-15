package com.example.domain.repo

import com.example.domain.entity.categoryRespons

interface MealsRepo {
    fun getMealzFromRemote() : categoryRespons
}