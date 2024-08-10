package com.example.apias.data.network

import com.example.apias.data.network.responses.ResultsResponse
import retrofit2.http.GET

interface ProductsApi {
    @GET("products")
    suspend fun fetchProducts(): ResultsResponse
}