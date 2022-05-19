package com.example.study04

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

// MainListAdapter 라는 클래스 안에 context 파라미터를 추가하고 BaseAdapter를 상속받는다
class MainListAdapter(
    val context: Context
) : BaseAdapter() {
    //dogList 변수는 arrayListOf형식의 Dog를 대입한다
    private var dogList = arrayListOf<Dog>()

    //Overriding :부모클래스 의 메서드를 자식클래스에서 재정의( 수정 or 추가) 해서 사용할 수 있는것.
    //listView는 4개의 메소드 (getView, getitem,GetItemId,getCount)
    //getCount 메소드
    //doglist Size를 Int 형식으로 반환
    override fun getCount(): Int {
        return dogList.size
    }

    //getItem 메소드
    // dogList를 어떤 타입의 데이터 대입이 가능하며 dogList를 반환
    override fun getItem(position: Int): Any {
        return dogList[position]
    }

    //getitemId는 Long 타입으로 반환함 반환값은 0
    override fun getItemId(position: Int): Long {
        return 0
    }
    

    //getView 메소드
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // LayoutInflater는 item을 Adapter에서 사용할 View로 부풀려주는(inflate) 역할을 한다.
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item, null)
        // 위에 생성된 View 를  리소스 폴더의 레이아웃 각 ID 값으로 View 와 연결 (dogName,dogGender,dogAge)
        val dogName = view.findViewById<TextView>(R.id.txtName)
        val dogGender = view.findViewById<TextView>(R.id.txtGender)
        val dogAge = view.findViewById<TextView>(R.id.txtAge)
        
        //ArrayList<Dog>의 변수 dog의 데이터를 담는다.
        val dog = dogList[position]
        
        //dog변수의Name과 gender ager를 각각 dogName,dogGender,dogAge에 대입
        dogName.text = dog.name
        dogGender.text = dog.gender
        dogAge.text = dog.age

        return view
    }
    
    //setDoglist 함수는 ArrayList<Dog>를 doglist 형식으로 하고
    fun setDogList(dogList: ArrayList<Dog>) {
        //dogList 를 dogList 에 대입
        this.dogList = dogList
    }

}
