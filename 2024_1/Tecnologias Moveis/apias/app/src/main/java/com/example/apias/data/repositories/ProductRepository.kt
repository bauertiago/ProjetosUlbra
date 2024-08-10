package com.example.apias.data.repositories

import com.example.apias.data.Product
import com.example.apias.data.dataSources.ProductDataSource
import com.example.apias.data.network.responses.convertToModel
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private  val dataSource: ProductDataSource
) {
    suspend fun fetchProducts(): List<Product>{
        return dataSource
            .fetchProducts()
            .productsResult.map { item -> item.convertToModel() }
    }
}