package com.example.recyclerviewactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewactivity.databinding.ListViewItemBinding

class RecyclerViewAdapter(
    val context: Context,
    private val itemClickListener: OnItemClickListener,
    private val gameList: ArrayList<Game>
) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = DataBindingUtil.inflate<ListViewItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.list_view_item, parent, false
        )
        return ViewHolder(binding, itemClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gameData = gameList[position]

        val resourceId =
            context.resources.getIdentifier(gameData.image, "drawable", context.packageName)
        holder.binding.imgGame.setImageResource(resourceId)
        holder.binding.txtGameName.text = gameData.name
        holder.binding.txtGameDesc.text = gameData.desc
        holder.binding.imgGame.setOnClickListener {
            itemClickListener.onItemClick(gameData.name)
        }
    }

    override fun getItemCount(): Int {
        return gameList.size
    }

    class ViewHolder constructor(
        val binding: ListViewItemBinding,
        private val itemClickListener: OnItemClickListener
    ) : RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                itemClickListener.onItemViewClick()
            }
        }
    }

    interface OnItemClickListener {
        fun onItemViewClick()
        fun onItemClick(gameName: String)
    }
}