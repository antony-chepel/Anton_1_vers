package com.king.knightsra.game

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import com.king.knightsra.databinding.ActivityGameBinding
import java.util.*
import kotlin.collections.ArrayList

class Game : AppCompatActivity() {
    var asdkasdkasdnmasdmasdjadsjasdj: Runnable = Runnable { }
    private lateinit var eioksadodkoskdas: ActivityGameBinding
   private var jisdjaijsdsad: Int = 0
    private var vioccvkocv = ArrayList<ImageView>()
    var astdasdiasdioasdasdoasd: Handler = Handler(Looper.getMainLooper())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        eioksadodkoskdas = ActivityGameBinding.inflate(layoutInflater)
        setContentView(eioksadodkoskdas.root)

        jisdjaijsdsad = 0
        eioksadodkoskdas.ijjisdia.text = "0"

         csuhds()
         sjadsa()

        isjdjasdjasd()

        civjixcjijixcv()
    }


    private fun csuhds(){
        eioksadodkoskdas.vijcvbjiv.setOnClickListener {
            ijdjidas()
        }

        eioksadodkoskdas.eokdskoakodas.setOnClickListener {
            ijdjidas()
        }
        eioksadodkoskdas.vokbkcv.setOnClickListener {
            ijdjidas()
        }
        eioksadodkoskdas.coxkvkocxko.setOnClickListener {
            ijdjidas()
        }
        eioksadodkoskdas.eokdsaokoasd.setOnClickListener {
            ijdjidas()
        }
    }


    private fun  sjadsa(){
        vioccvkocv = arrayListOf(
            eioksadodkoskdas.vokbkcv,
            eioksadodkoskdas.coxkvkocxko,
            eioksadodkoskdas.vijcvbjiv,
            eioksadodkoskdas.eokdskoakodas,
            eioksadodkoskdas.eokdsaokoasd,
            eioksadodkoskdas.udiwqdo,

            )
    }

    @SuppressLint("SetTextI18n")
    fun civjixcjijixcv() {
        jisdjaijsdsad = 0
        eioksadodkoskdas.ijjisdia.text = "Score : $jisdjaijsdsad"
        isjdjasdjasd()
        eioksadodkoskdas.cixjvixc.text = "Time : " + 15000 / 1000

        for (dijfjdis in vioccvkocv) {
            dijfjdis.visibility = View.INVISIBLE
        }

        object : CountDownTimer(10000, 1000) {
            @SuppressLint("SetTextI18n")
            override fun onFinish() {
                eioksadodkoskdas.cixjvixc.text = "Time's up!!!"
                astdasdiasdioasdasdoasd.removeCallbacks(asdkasdkasdnmasdmasdjadsjasdj)

                Handler().postDelayed({
                    startActivity(Intent(this@Game,Freushd::class.java)
                        .putExtra("score",jisdjaijsdsad.toString())
                    )
                },1500)

            }

            @SuppressLint("SetTextI18n")
            override fun onTick(p0: Long) {
                eioksadodkoskdas.cixjvixc.text = "Time : " + p0 / 1000
            }
        }.start()
    }


    private fun isjdjasdjasd() {
        asdkasdkasdnmasdmasdjadsjasdj = Runnable {
            for (rasdfasdgasdgshad in vioccvkocv) {
                rasdfasdgasdgshad.visibility = View.INVISIBLE
            }
            val cijvx = Random()
            val sodkkdo = cijvx.nextInt(5 - 0)
            vioccvkocv[sodkkdo].visibility = View.VISIBLE
            astdasdiasdioasdasdoasd.postDelayed(asdkasdkasdnmasdmasdjadsjasdj, 800)
        }
        astdasdiasdioasdasdoasd.post(asdkasdkasdnmasdmasdjadsjasdj)
    }


    @SuppressLint("SetTextI18n")
    fun ijdjidas() {
        jisdjaijsdsad++
        eioksadodkoskdas.ijjisdia.text = "Score : $jisdjaijsdsad"
    }


}