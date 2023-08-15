package com.example.labexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.labexercise.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.calculate.setOnClickListener{

            val length_value = binding.length.text.toString().toFloat()
            val width_value = binding.width.text.toString().toFloat()
            val height_value = binding.height.text.toString().toFloat()

            val vol = length_value * width_value * height_value
            val cost = vol * 0.23
            val charges = vol * 0.5
            val profits = charges - cost


            binding.calVolume.text = vol.toString()
            binding.calCost.text = cost.toString()
            binding.calCharge.text = charges.toString()
            binding.calProfit.text = profits.toString()

        }
    }
}