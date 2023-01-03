package com.king.knightsra.repo

import com.king.knightsra.api.ApiInterface
import com.king.knightsra.api.HostInterface
import javax.inject.Inject

class Repository @Inject constructor(private val apiInterface: ApiInterface,private val hostInterface: HostInterface) {

    suspend fun roksdjias() = apiInterface.jshdhuas()
    suspend fun bijvjivb() = hostInterface.eoodsasdhu()
}