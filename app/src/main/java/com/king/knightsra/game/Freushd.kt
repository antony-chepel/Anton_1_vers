package com.king.knightsra.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.king.knightsra.databinding.ActivityFreushdBinding

class Freushd : AppCompatActivity() {
    private lateinit var ksdskdn : ActivityFreushdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ksdskdn = ActivityFreushdBinding.inflate(layoutInflater)
        setContentView(ksdskdn.root)
        hudhf()
        val score = intent.getStringExtra("score")
        ksdskdn.tvScore.text = "Your score : $score"
        ksdskdn.button2.setOnClickListener {
            startActivity(Intent(this,Game::class.java))
        }

    }

    private fun hudhf(){
        for(i in 0..9){
                val res  = Hteususa.listusdhu[i]
                Log.d("Res",res.toString())

        }
    }
}