package com.king.knightsra.web

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.king.knightsra.R
import com.king.knightsra.constans.ConstansUsage.wisjdjids
import com.king.knightsra.constans.ConstansUsage.doekskodsdji
import com.king.knightsra.constans.ConstansUsage.rijidsjis
import com.king.knightsra.constans.ConstansUsage.cijcjijcvxcv
import com.king.knightsra.constans.ConstansUsage.woeksijdsjdsi
import com.king.knightsra.constans.ConstansUsage.possldkdsksd
import com.king.knightsra.constans.ConstansUsage.zizjxzxji
import com.king.knightsra.constans.ConstansUsage.vococvkvcjvic
import com.king.knightsra.constans.ConstansUsage.eokoskosd
import com.king.knightsra.constans.ConstansUsage.sddssdkmsd
import com.king.knightsra.constans.ConstansUsage.bokbknbn
import com.king.knightsra.constans.ConstansUsage.qowijsjid
import com.king.knightsra.constans.ConstansUsage.vokkcvkvc
import com.king.knightsra.constans.ConstansUsage.cokcvcv
import com.king.knightsra.databinding.ActivityHyeisawqBinding
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class Nheisuhd : AppCompatActivity() {
    lateinit var wiowjwidjiqw: WebView
    var rokoskdka: ValueCallback<Array<Uri>>? = null

    var vocvkovcokcv: String? = null

    lateinit var ckovkxcvkocv: ActivityHyeisawqBinding
    private val hstrssisdjias = 1

    var voccvijbjibv = ""
    private var woeijsjdijida = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ckovkxcvkocv = ActivityHyeisawqBinding.inflate(layoutInflater)
        setContentView(ckovkxcvkocv.root)

        wiowjwidjiqw = ckovkxcvkocv.roesa
        Snackbar.make(
            ckovkxcvkocv.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()

        val xzcjnzcnjjsa = CookieManager.getInstance()
        xzcjnzcnjjsa.setAcceptCookie(true)
        xzcjnzcnjjsa.setAcceptThirdPartyCookies(wiowjwidjiqw, true)
        yueijisjida()
        riejsdokdos()
        eijjidasksamasd()

    }

     private fun riejsdokdos(){
         val vockvcbji: Activity = this
         wiowjwidjiqw.webViewClient = object : WebViewClient() {
             override fun shouldOverrideUrlLoading(wokksd: WebView, boobkvkovb: String): Boolean {
                 try {
                     if (URLUtil.isNetworkUrl(boobkvkovb)) {
                         return false
                     }
                     if (rokekosdjjasdi(boobkvkovb)) {

                         val fifdofkkg = Intent(Intent.ACTION_VIEW)
                         fifdofkkg.data = Uri.parse(boobkvkovb)
                         startActivity(fifdofkkg)
                     } else {

                         Toast.makeText(
                             applicationContext,
                             "Application is not installed",
                             Toast.LENGTH_LONG
                         ).show()
                         startActivity(
                             Intent(
                                 Intent.ACTION_VIEW,
                                 Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                             )
                         )
                     }
                     return true
                 } catch (e: Exception) {
                     return false
                 }
                 wokksd.loadUrl(boobkvkovb)
             }


             override fun onPageFinished(view: WebView, url: String) {
                 super.onPageFinished(view, url)

                 ixjcjizxic(url)
             }

             override fun onReceivedError(
                 view: WebView,
                 errorCode: Int,
                 description: String,
                 failingUrl: String
             ) {
                 Toast.makeText(vockvcbji, description, Toast.LENGTH_SHORT).show()
             }

         }

     }





    private fun oejijijidsa(cokv: String) {
        OneSignal.setExternalUserId(
            cokv,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(froeoskd: JSONObject) {
                    try {
                        if (froeoskd.has("push") && froeoskd.getJSONObject("push").has("success")) {
                            val xdosdkdsf = froeoskd.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $xdosdkdsf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (froeoskd.has("email") && froeoskd.getJSONObject("email").has("success")) {
                            val roekkodsjiidas =
                                froeoskd.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $roekkodsjiidas"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (froeoskd.has("sms") && froeoskd.getJSONObject("sms").has("success")) {
                            val xsoksdjiijwdok = froeoskd.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $xsoksdjiijwdok"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }






    private fun rokekosdjjasdi(uri: String): Boolean {

        val rokwdo = packageManager
        try {

            rokwdo.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }


    private fun eijjidasksamasd(){
        wiowjwidjiqw.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                okqkdosk: WebView, bibjvbjibv: ValueCallback<Array<Uri>>,
                ijejiji: FileChooserParams
            ): Boolean {
                rokoskdka?.onReceiveValue(null)
                rokoskdka = bibjvbjibv
                var eokkosahuhadhud: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (eokkosahuhadhud!!.resolveActivity(packageManager) != null) {

                    var foodfjifjid: File? = null
                    try {
                        foodfjifjid = wiejijsd()
                        eokkosahuhadhud.putExtra("PhotoPath", vocvkovcokcv)
                    } catch (ex: IOException) {

                    }


                    if (foodfjifjid != null) {
                        vocvkovcokcv = "file:" + foodfjifjid.absolutePath
                        eokkosahuhadhud.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(foodfjifjid)
                        )
                    } else {
                        eokkosahuhadhud = null
                    }
                }
                val owjijidksokosad = Intent(Intent.ACTION_GET_CONTENT)
                owjijidksokosad.addCategory(Intent.CATEGORY_OPENABLE)
                owjijidksokosad.type = "image/*"
                val vokvcvjibjivb: Array<Intent?> =
                    eokkosahuhadhud?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val judoffdjis = Intent(Intent.ACTION_CHOOSER)
                judoffdjis.putExtra(Intent.EXTRA_INTENT, owjijidksokosad)
                judoffdjis.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                judoffdjis.putExtra(Intent.EXTRA_INITIAL_INTENTS, vokvcvjibjivb)
                startActivityForResult(
                    judoffdjis, hstrssisdjias
                )
                return true
            }

            @Throws(IOException::class)
            private fun wiejijsd(): File {
                var vovckfjifjdig = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!vovckfjifjdig.exists()) {
                    vovckfjifjdig.mkdirs()
                }


                vovckfjifjdig =
                    File(vovckfjifjdig.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return vovckfjifjdig
            }

        }

        wiowjwidjiqw.loadUrl(rieioskdkodsjisdjia())

    }


    private fun rieioskdkodsjisdjia(): String {

        val vokkvcij = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)


        val eospldldssd = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        var frokekokods = ""
        if (rijidsjis != "null"){
            frokekokods = "$zizjxzxji$cokcvcv$rijidsjis&$doekskodsdji$eospldldssd&$wisjdjids$vococvkvcjvic&$bokbknbn$sddssdkmsd&$qowijsjid$possldkdsksd&$vokkcvkvc$eokoskosd"
            oejijijidsa(eospldldssd.toString())
        } else {
            frokekokods = "$zizjxzxji$cokcvcv$woeksijdsjdsi&$doekskodsdji$eospldldssd&$wisjdjids$vococvkvcjvic&$bokbknbn$sddssdkmsd&$qowijsjid$possldkdsksd&$vokkcvkvc$cijcjijcvxcv"
            oejijijidsa(eospldldssd.toString())
        }

        Log.d("TESTAG", "Test Result $frokekokods")
        return vokkvcij.getString("SAVED_URL", frokekokods).toString()
    }

    override fun onActivityResult(vokfjidji: Int, okodkosad: Int, vovckokvc: Intent?) {
        if (vokfjidji != hstrssisdjias || rokoskdka == null) {
            super.onActivityResult(vokfjidji, okodkosad, vovckokvc)
            return
        }
        var oekkoskodo: Array<Uri>? = null

        if (okodkosad == AppCompatActivity.RESULT_OK) {
            if (vovckokvc == null || vovckokvc.data == null) {
                oekkoskodo = arrayOf(Uri.parse(vocvkovcokcv))
            } else {
                val cokvokovc = vovckokvc.dataString
                if (cokvokovc != null) {
                    oekkoskodo = arrayOf(Uri.parse(cokvokovc))
                }
            }
        }
        rokoskdka?.onReceiveValue(oekkoskodo)
        rokoskdka = null
    }


    private fun yueijisjida() {
        val vfofkgji = wiowjwidjiqw.settings
        vfofkgji.setAppCacheEnabled(true)
        vfofkgji.displayZoomControls = false
        vfofkgji.builtInZoomControls = true
        vfofkgji.javaScriptEnabled = true


        vfofkgji.javaScriptCanOpenWindowsAutomatically = true
        vfofkgji.setSupportMultipleWindows(false)
        vfofkgji.allowContentAccess = true
        vfofkgji.useWideViewPort = true

        vfofkgji.pluginState = WebSettings.PluginState.ON
        vfofkgji.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        vfofkgji.loadWithOverviewMode = true
        vfofkgji.allowFileAccess = true

        vfofkgji.setSupportZoom(true)
        vfofkgji.domStorageEnabled = true
        vfofkgji.userAgentString = vfofkgji.userAgentString.replace("; wv", "")

    }


    fun ixjcjizxic(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {
            if (voccvijbjibv == "") {
                voccvijbjibv = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val rokekodsdjiaji = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val lxokzokozji = rokekodsdjiaji.edit()
                lxokzokozji.putString("SAVED_URL", lurlurlurlurlur)
                lxokzokozji.apply()
            }
        }
    }



    override fun onBackPressed() {

        if (wiowjwidjiqw.canGoBack()) {
            if (woeijsjdijida) {
                wiowjwidjiqw.stopLoading()
                wiowjwidjiqw.loadUrl(voccvijbjibv)
            }
            this.woeijsjdijida = true
            wiowjwidjiqw.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                woeijsjdijida = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }




}