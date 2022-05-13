package com.example.study03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.TtsSpan
import java.nio.channels.Pipe
import javax.microedition.khronos.egl.EGL10

class MainActivity : AppCompatActivity() {

    // 4. 출력으로 확인 가능 한 프로젝트 만들어 보기
    // C : 생성 -> 아이템을 추가하는 기능 // 중복 안되게
    // R : 읽기
    // U : 수정 -> 키값으로 해당 아이템을 찾아서 name, age, phone 중에 아무거나 변경 가능 한 함수
    // D : 삭제 -> 키값으로 해당 아이템을 삭제 하는 함수
    // S : 검색 -> 키값으로 해당 아이템을 찾아서 name, age, phone를 출력 하는 함수

    var createInfo = mutableListOf(
        mapOf(
            "철수" to Pair(30, "010-1"),
            "민수" to Pair(31, "010-2"),
            "상수" to Pair(32, "010-3"),
            "정수" to Pair(33, "010-4"),
            "영수" to Pair(33, "010-1")
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addItem(mapOf("동수" to Pair(35, "031-111")))
    }

    private fun addItem(info: Map<String, Pair<Int, String>>) {
        if (createInfo.contains(info)) {
            println("$info 는 중복된 값입니다.")

        } else {
            createInfo.add(info)
            println("${createInfo.last()} 회원님 가입을 축하드립니다.")
        }

        println(createInfo)
    }
}