package com.example.recyclerviewactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewactivity.databinding.ListViewItemBinding

class RecyclerViewAdapter(val context: Context, private val gameList: ArrayList<Game>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = DataBindingUtil.inflate<ListViewItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.list_view_item, parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gameData = gameList[position]

        val resourceId =
            context.resources.getIdentifier(gameData.image, "drawable", context.packageName)
        holder.binding.imgGame.setImageResource(resourceId)
        holder.binding.txtGameName.text = gameData.name
        holder.binding.txtGameDesc.text = gameData.desc
    }

    override fun getItemCount(): Int {
        return gameList.size
    }

    class ViewHolder constructor(
        val binding: ListViewItemBinding
    ) : RecyclerView.ViewHolder(binding.root)

}