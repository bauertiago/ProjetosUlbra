package com.example.apias.data.di

import com.example.apias.data.dataSources.ProductDataSource
import com.example.apias.data.network.ProductsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun  providesProductDataSource(productsApi: ProductsApi): ProductDataSource{
        return ProductDataSource(productsApi)
    }
}