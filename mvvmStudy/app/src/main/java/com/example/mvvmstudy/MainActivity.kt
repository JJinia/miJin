package com.example.mvvmstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 나중에 값이 설정될거라고 lateinit 로 설정
    private lateinit var myNumberViewModel: MyNumberViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        myNumberViewModel = ViewModelProvider(this).get(MyNumberViewModel::class.java)

        myNumberViewModel.currentValue.observe(this, Observer {
            Log.d(TAG, "MainActivity -myNumberViewNodel - currentValue 라이브 데이터 값 변경 : $it")
            binding.txtNumber.text = it.toString()
        })

        binding.btnPlus.setOnClickListener {
            myNumberViewModel.upateValue(
                actionType = ActionType.PLUS,
                binding.editUserInput.text.toString().toInt()
            )
        }

        binding.btnMinus.setOnClickListener {
            myNumberViewModel.upateValue(
                actionType = ActionType.MINUS,
                binding.editUserInput.text.toString().toInt()
            )
        }
    }

    companion object {
        const val TAG: String = "로그"
    }
}