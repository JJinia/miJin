package com.example.recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.recyclerviewactivity.databinding.ActivityRecyclerViewBinding
import com.example.recyclerviewactivity.databinding.ListViewItemBinding

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityRecyclerViewBinding

    val gameList = arrayListOf<Game>(
        Game("image01", "던전 앤 파이터", "2D형 알피지 게임"),
        Game("image02", "메이플 스토리", "2등신 케릭 알피지 게임"),
        Game("image03", "라그나로크", "2D형 알피지 게임"),
        Game("image04", "카트라이더", "레이싱 게임")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view)

        binding.btnASceneMove.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.recyclerView.adapter = RecyclerViewAdapter(this, gameList)
    }
}