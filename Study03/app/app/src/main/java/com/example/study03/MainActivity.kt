package com.example.study03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.TtsSpan
import java.nio.channels.Pipe
import javax.microedition.khronos.egl.EGL10
import kotlin.jvm.internal.MagicApiIntrinsics

class MainActivity : AppCompatActivity() {

    // 4. 출력으로 확인 가능 한 프로젝트 만들어 보기
    // C : 생성 -> 아이템을 추가하는 기능 // 중복 안되게
    // R : 읽기
    // U : 수정 -> 키값으로 해당 아이템을 찾아서 name, age, phone 중에 아무거나 변경 가능 한 함수
    // D : 삭제 -> 키값으로 해당 아이템을 삭제 하는 함수

    var createInfo = hashMapOf(
        "철수" to 30,
        "민수" to 31,
        "상수" to 32,
        "정수" to 33,
        "영수" to 33
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addItem("동수", 32)
        updateItem("동수", 3)
        deleteItem("영수")
    }

    private fun addItem(name: String, age: Int) {
        if (createInfo.containsKey(name)) {
            println("$name 는 중복된 이름 입니다.")
        } else {
            createInfo.put(name, age)
            println("$name 회원님 가입을 축하드립니다.")
        }
        println(createInfo)
    }

    fun updateItem(name: String, age: Int) {
        if (createInfo.containsKey(name)) {
            createInfo.forEach { item ->
                if (item.key == name) {
                    println("$name 의 정보를 수정하였습니다.")
                    createInfo.set(item.key, age)
                }
            }
        } else {
            println("존재 하지 않는 회원입니다.")
        }

        println("${createInfo}")
    }

    fun deleteItem(name: String) {
        if (createInfo.containsKey(name)) {
            createInfo.forEach {
                if (it.key == name) {
                    println("$name 의 회원정보가 삭제되었습니다.")
                    createInfo.remove(name)
                }
            }
        } else {
            println("존재 하지 않는 회원입니다.")
        }
        println("${createInfo}")

    }
}