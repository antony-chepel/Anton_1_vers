package com.king.knightsra.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.*
import com.appsflyer.AppsFlyerConversionListener
import com.facebook.applinks.AppLinkData
import com.king.knightsra.constans.ConstanceAppClass.woeijsd
import com.king.knightsra.constans.ConstanceAppClass.sjdijidas
import com.king.knightsra.data.CountryCodeJS
import com.king.knightsra.data.GeoDev
import com.king.knightsra.repo.Repository
import com.orhanobut.hawk.Hawk
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class RaptorViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    val countryCodeJS : MutableLiveData<Response<CountryCodeJS>> = MutableLiveData()
    val geoDev : MutableLiveData<Response<GeoDev>> = MutableLiveData()



    val eijsdjidsji = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(woeijsd, dataGotten)
        }

        override fun onConversionDataFail(p0: String?) {
            Log.e("dev_test", "error getting conversion data: $p0" );
        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }



    fun rtosokdahjsdhua() {
        viewModelScope.launch {
            countryCodeJS.value = repository.roksdjias()

        }
    }


    fun vicjvvchubh() {
        viewModelScope.launch {
            geoDev.value = repository.bijvjivb()

        }
    }


    fun eijsjdai(vijcvjicv: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            vijcvjicv
        ) { toriijdf: AppLinkData? ->
            toriijdf?.let {
                val cifdodf = toriijdf.targetUri.host.toString()
                Hawk.put(sjdijidas, cifdodf)
            }
            if (toriijdf == null) {

            }
        }
    }

}