package com.example.study03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    /*
    * 1. 변수선언
    *   - 지역변수와 전역변수
    *  val = 변경이 불가능 한 변수
    *  var = 변경이 가능 한 변수
    *  지역변수 = 함수내에서 생성 해서 함수 내에서만 사용 가능하다.
    *  전역변수 = 함수 밖에서 선언에서 그 화면내에서 언제든지 사용 가능하다.
    *
    * 2. 함수선어
    *   - fun 내에서는 선언할 수 없다.
    * * */
    var num01: Int = 0
    var num02: Double = 0.0
    var num03: String = ""
    var num04: Long = 0
    var num05: Boolean = false
    var result = 0.0

    val list: List<Int> = listOf(7, 2, 4)
    val map: Map<String, Int> = mapOf("Tom" to 18, "MJ" to 171717)
    val set1: Set<Int> = setOf(1, 2, 3, 3)

    val list1: List<Int> = mutableListOf(4, 5, 6)
    val map1: Map<String, Int> = hashMapOf("Tom" to 28, "MJ" to 7777)
    val set2: Set<Int> = mutableSetOf(4, 4, 5, 6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}