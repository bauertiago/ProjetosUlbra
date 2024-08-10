package com.example.apias.data.dataSources

import com.example.apias.data.network.ProductsApi
import com.example.apias.data.network.responses.ResultsResponse
import javax.inject.Inject

class ProductDataSource @Inject constructor(private  val api: ProductsApi) {
    suspend fun fetchProducts(): ResultsResponse {
        return api.fetchProducts()
    }
}