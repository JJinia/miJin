package com.example.bmiproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bmiproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initUi()
    }

    private fun initUi() {
        binding.btnInput.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("height", binding.editInputHeight.text.toString().toDouble())
            intent.putExtra("weight", binding.editInputWeight.text.toString().toDouble())

            startActivity(intent)
            finish()
        }
    }
}