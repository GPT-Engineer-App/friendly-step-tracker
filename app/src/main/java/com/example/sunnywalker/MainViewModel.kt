// MainViewModel.kt
package com.example.sunnywalker

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val steps: LiveData<Int> = StepCounterService.steps
    val distance: LiveData<Float> = StepCounterService.distance
    val calories: LiveData<Float> = StepCounterService.calories
}