package com.example.study04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

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
    private var stringLint = arrayListOf<String>()

    // 리스트 뷰 추가 삭제
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val buttonAdd = findViewById<Button>(R.id.btnAdd)
        val buttonDelete = findViewById<Button>(R.id.btnDelete)
        val editName = findViewById<EditText>(R.id.editName)
        val editGender = findViewById<EditText>(R.id.editGender)
        val editAge = findViewById<EditText>(R.id.editAge)

        val dogAdapter = MainListAdapter(this)

        dogAdapter.setDogList(dogList)

        listView.adapter = dogAdapter

        buttonAdd.setOnClickListener {
            dogAdd(editName.text.toString(), editGender.text.toString(), editAge.text.toString())
            dogAdapter.setDogList(dogList)
            dogAdapter.notifyDataSetChanged()
        }

        buttonDelete.setOnClickListener {
            dogDelete(editName.text.toString())
            dogAdapter.setDogList(dogList)
            dogAdapter.notifyDataSetChanged()
        }
    }

    private fun dogAdd(name: String, gender: String, age: String): ArrayList<Dog> {
        dogList.add(Dog(name, gender, age))
        return dogList
    }

    private fun dogDelete(name: String) {
        for (i in 0..dogList.size - 1) {
            if (dogList[i].name == name) {
                dogList.remove(dogList[i])
            }
        }
    }
}