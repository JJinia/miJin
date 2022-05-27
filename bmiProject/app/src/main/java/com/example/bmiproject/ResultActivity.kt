package com.example.bmiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.bmiproject.databinding.ActivityResultBinding
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_result)

        initUi()
    }

    private fun initUi() {
        val height = intent.getDoubleExtra("height", 0.0)
        val weight = intent.getDoubleExtra("weight", 0.0)
        val bmiResult = bmiCalculate(height, weight)

        binding.txtBmi.text = bmiResult.toString()
        binding.txtBmiResult.text = bmiText(bmiResult)

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    private fun bmiCalculate(height: Double, weight: Double): Double {

        return weight / (height / 100.0).pow(2.0)
    }

    private fun bmiText(bmi: Double): String {
        return when {
            bmi >= 35.0 -> "고도 비만"
            bmi >= 30.0 -> "중정도 비만"
            bmi >= 25.0 -> "경도 비만"
            bmi >= 23.0 -> "과체중"
            bmi >= 18.5 -> "정상체중"
            else -> "저체중"
        }
    }
}