package com.example.recyclerviewactivity

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.recyclerviewactivity.databinding.ListViewItemBinding

class ListViewAdapter(val context: Context, val gameList: ArrayList<Game>) : BaseAdapter() {
    override fun getCount(): Int {
        return gameList.size
    }

    override fun getItem(position: Int): Any {
        return gameList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding = ListViewItemBinding.inflate(LayoutInflater.from(context))

        val gameData = gameList[position]
        val resourceId =
            context.resources.getIdentifier(gameData.image, "drawable", context.packageName)
        binding.imgGame.setImageResource(resourceId)
        binding.txtGameName.text = gameData.name
        binding.txtGameDesc.text = gameData.desc

        return binding.root
    }

}