package com.example.mealzapp.Mealz.di

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.categoryRespons
import com.example.domain.usecase.getMealz
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor( private val getMealUseCase:getMealz):ViewModel() {

    private val _categories:MutableStateFlow<categoryRespons?> = MutableStateFlow(null)
    val categories:StateFlow<categoryRespons?> = _categories

    fun getMeals(){
        viewModelScope.launch {
            try {
               _categories.value= getMealUseCase()
            }catch (e:Exception){
                Log.e("MealsViewModel",e.message.toString())
            }
        }
    }
}