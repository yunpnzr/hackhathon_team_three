package com.cryptoapp.project_cryptoapp.data.source.network.model.detailcrypto

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class MarketData(
    @SerializedName("current_price")
    val currentPrice: CurrentPrice?,
)
