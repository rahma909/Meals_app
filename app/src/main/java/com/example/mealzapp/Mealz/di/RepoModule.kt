package com.example.mealzapp.Mealz.di

import com.example.data.remote.ApiServices
import com.example.data.repo.MealsRepoImpl
import com.example.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun proidRep(apiServices: ApiServices):MealsRepo{
        return MealsRepoImpl(apiServices)
    }

}