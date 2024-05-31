// StepCounterService.kt
package com.example.sunnywalker

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.MutableLiveData

class StepCounterService : Service() {

    companion object {
        val steps = MutableLiveData<Int>()
        val distance = MutableLiveData<Float>()
        val calories = MutableLiveData<Float>()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Simulate step counting
        steps.postValue(1000)
        distance.postValue(0.8f)
        calories.postValue(50f)
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}