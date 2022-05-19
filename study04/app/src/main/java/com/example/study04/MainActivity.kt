package com.example.study04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

// dogList 변수 를 arrayListof 타입으로 선언 (size:7)
class MainActivity : AppCompatActivity() {
    private var dogList = arrayListOf(
        Dog("Chow Chow", "Male", "4"),
        Dog("Breed Pomeranian", "Female", "1"),
        Dog("Golden Retriver", "Female", "3"),
        Dog("Yorkshire Terrier", "Male", "5"),
        Dog("Pug", "Male", "4"),
        Dog("Alaskan Malamute", "Male", "7"),
        Dog("Shih Tzu", "Female", "5")
    )
    // stringLint변수 를 arrayListof 타입으로 선언
    private var stringLint = arrayListOf<String>()

    // 리스트 뷰 추가 삭제
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // ListView 타입의 listView라는 ID 를찾아서 listView 에 대입
        val listView = findViewById<ListView>(R.id.listView)
        
        // Button 타입의 btnAdd라는 ID 를찾아서 buttonAdd 에 대입
        val buttonAdd = findViewById<Button>(R.id.btnAdd)
        
        // Button 타입의 btnDelete라는 ID 를찾아서 buttonDelete 에 대입
        val buttonDelete = findViewById<Button>(R.id.btnDelete)
        
        //위와 동일
        val editName = findViewById<EditText>(R.id.editName)
        val editGender = findViewById<EditText>(R.id.editGender)
        val editAge = findViewById<EditText>(R.id.editAge)
        
        //메인리스트어뎁터의 extend 값을 dogAapter 변수에 대입
        val dogAdapter = MainListAdapter(this)
        
        // 도그어뎁터에 도그리스트를 놓아라
        dogAdapter.setDogList(dogList)

        // 도그어뎁터를 리스트뷰어뎁터에 대입
        listView.adapter = dogAdapter

        //buttonAdd를 클릭햇을때 이벤트 발생
        buttonAdd.setOnClickListener {
            //dogAdd(editName,EditGender,editAge을 텍스트 형식을 String형식으로 변환) 호출
            dogAdd(editName.text.toString(), editGender.text.toString(), editAge.text.toString())
            //도그리스트를 dogAdapter 에 놓고
            dogAdapter.setDogList(dogList)
            //dogAdapter를 업데이트
            dogAdapter.notifyDataSetChanged()
        }

        //buttonDelete를 클릭햇을때 이벤트 발생
        buttonDelete.setOnClickListener {
            //dogDelete는 editNmae을 텍스트를 String형식으로 변환 호출
            dogDelete(editName.text.toString())
            //dogList를 dogAdapter 에 놓고
            dogAdapter.setDogList(dogList)
            //dogAdapter를 업데이트
            dogAdapter.notifyDataSetChanged()
        }
    }

    //dogAdd 합수선언
    private fun dogAdd(name: String, gender: String, age: String): ArrayList<Dog> {
        //doglist를 추가(Dog형식과 동일하게)
        dogList.add(Dog(name, gender, age))
        //dogList 를 반환 
        return dogList
    }

    //dogDelete 합수선언
    private fun dogDelete(name: String) {
        //반복문 시작 0~dogList Size 갯수에서 -1 한만큼
        for (i in 0..dogList.size - 1) {
            //dogList 인덱스의 name과 입력한 name 이 같으면 
            if (dogList[i].name == name) {
                //해당 dogList 인덱스를 지움
                dogList.remove(dogList[i])
            }
        }
    }
}
