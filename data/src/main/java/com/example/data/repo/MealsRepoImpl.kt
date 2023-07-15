package com.example.data.repo

import com.example.data.remote.ApiServices
import com.example.domain.entity.categoryRespons
import com.example.domain.repo.MealsRepo

class MealsRepoImpl(private val apiServices: ApiServices) :MealsRepo{
    override fun getMealzFromRemote()=apiServices.getMeals()
}