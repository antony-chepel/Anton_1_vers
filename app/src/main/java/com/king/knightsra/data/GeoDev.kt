package com.king.knightsra.data

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class GeoDev(
    @SerializedName("geo")
    val wosod: String,
    @SerializedName("view")
    val bokbvb: String,
    @SerializedName("appsChecker")
    val roidsufh: String,
)
