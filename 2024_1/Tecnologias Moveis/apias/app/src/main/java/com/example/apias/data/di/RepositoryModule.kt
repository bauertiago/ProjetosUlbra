package com.example.apias.data.di

import com.example.apias.data.dataSources.ProductDataSource
import com.example.apias.data.repositories.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun providesProduct(dataSource: ProductDataSource): ProductRepository{
        return ProductRepository(dataSource)
    }
}