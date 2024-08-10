package com.example.apias.data.network.responses

import com.google.gson.annotations.SerializedName

data class ResultsResponse(
    @SerializedName("products")
    val productsResult: List<ProductResponse>
)
