// MainActivity.kt
package com.example.sunnywalker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.sunnywalker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.steps.observe(this, Observer { steps ->
            binding.stepsTextView.text = "Steps: $steps"
        })

        viewModel.distance.observe(this, Observer { distance ->
            binding.distanceTextView.text = "Distance: $distance km"
        })

        viewModel.calories.observe(this, Observer { calories ->
            binding.caloriesTextView.text = "Calories: $calories kcal"
        })

        startService(Intent(this, StepCounterService::class.java))
    }
}