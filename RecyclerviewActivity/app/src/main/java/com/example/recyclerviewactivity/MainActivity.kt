package com.example.recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.recyclerviewactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val gameList = arrayListOf<Game>(
        Game("image01", "던전 앤 파이터", "2D형 알피지 게임"),
        Game("image02", "메이플 스토리", "2등신 케릭 알피지 게임"),
        Game("image03", "라그나로크", "2D형 알피지 게임"),
        Game("image04", "카트라이더", "레이싱 게임")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnBSceneMove.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }

        binding.listView.adapter = ListViewAdapter(this, gameList)

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "선택 하신 게임 : ${gameList[position].name}", Toast.LENGTH_SHORT).show()
        }
    }
}