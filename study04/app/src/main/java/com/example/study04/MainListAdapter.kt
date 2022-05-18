package com.example.study04

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MainListAdapter(
    val context: Context
) : BaseAdapter() {
    private var dogList = arrayListOf<Dog>()

    override fun getCount(): Int {
        return dogList.size
    }

    override fun getItem(position: Int): Any {
        return dogList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item, null)

        val dogName = view.findViewById<TextView>(R.id.txtName)
        val dogGender = view.findViewById<TextView>(R.id.txtGender)
        val dogAge = view.findViewById<TextView>(R.id.txtAge)

        val dog = dogList[position]

        dogName.text = dog.name
        dogGender.text = dog.gender
        dogAge.text = dog.age

        return view
    }

    fun setDogList(dogList: ArrayList<Dog>) {
        this.dogList = dogList
    }

}