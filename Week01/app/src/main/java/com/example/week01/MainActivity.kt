package com.example.week01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    // 1. 두 정수를 받아 결과를 출력하는 함수를 만들어 보세요.
    // 2. 두 문자열을 받아 결과를 출력하는 함수를 만들어 보세요.
    // 3. 두 정수와 문자(+ - * /)을 받아 계산하는 함수를 만들어 보세요.

    // 4. 두 정수를 입력 받아 두수 사이의 합을 구하는 함수를 만들어 보세요.
    //    (예: 입력 1, 10) -> 출력 결과값 ( 55 )

    ///////// 검색 해도 됨 (과제 해서 gitHub에 올리기)
    // 5. 두 정수를 입력 받아 홀수, 짝수의 합을 구하는 함수를 만들어 보세요.
    //    (예: 입력 1, 10) -> 출력 결과값 ( 홀수의 합은? 25, 짝수의 합은? 30 )
    // 6. List에 들어 있는 수들의 합을 출력하는 함수를 만들어 보세요.
    //    (예: List(10,20,30)) -> 출력 결과값 ( 리스트안에 포함 되어 있는 수의 합은? 60 입니다.)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputNumber(1, 2)
        inputText("hello", "wold")
        calculateToWhen(3, 4, "/")
        calculateToIf(6, 4, "/")
        sumBetweenTwoNumbers(1, 4)
    }

    private fun inputNumber(number01: Int, number02: Int) {
        println("입력 받은 정수 $number01 $number02")
    }

    private fun inputText(text01: String, text02: String) {
        println("입력 받은 문자열 $text01 $text02")
    }

    private fun calculateToWhen(number03: Int, number04: Int, cal: String) {
        val result = when (cal) {
            "+" -> "입력 된 두 수의 + ? ${number03 + number04}"
            "-" -> "입력 된 두 수의 - ? ${number03 - number04}"
            "/" -> "입력 된 두 수의 / ? ${number03 / number04}"
            "*" -> "입력 된 두 수의 * ? ${number03 * number04}"
            else -> "입력이 잘못된 연산입니다."
        }
        println(result)
    }

    private fun calculateToIf(number05: Int, number06: Int, cal1: String) {
        if (cal1 == "+") {
            println("입력 된 두수의 + ? ${number05 + number06}")
        } else if (cal1 == "-") {
            println("입력 된 두수의 - ? ${number05 - number06}")
        } else if (cal1 == "/") {
            println("입력 된 두수의 * ? ${number05 / number06}")
        } else if (cal1 == "*") {
            println("입력 된 두수의 / ? ${number05 * number06}")
        } else {
            println("입력이 잘못된 연산입니다.")
        }
    }

    private fun sumBetweenTwoNumbers(number01: Int, number02: Int) {
        var sum: Int = 0
        for (i in number01..number02) {
            sum += i
        }
        println("입력된 두수 사이의 합은 $sum")

    }


}