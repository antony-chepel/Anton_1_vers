package com.king.knightsra.api

import com.king.knightsra.data.CountryCodeJS
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun jshdhuas(): Response<CountryCodeJS>


}



