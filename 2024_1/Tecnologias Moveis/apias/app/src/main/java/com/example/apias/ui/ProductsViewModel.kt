package com.example.apias.ui

import android.service.media.MediaBrowserService
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apias.commons.Result
import com.example.apias.data.Product
import com.example.apias.data.repositories.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val productRepository: ProductRepository
) : ViewModel() {
    fun fetchProducts(): LiveData<Result<List<Product>>> {
        val liveData = MutableLiveData<Result<List<Product>>>()

        liveData.postValue(Result.Loading)

        viewModelScope.launch(Dispatchers.IO){
            try {
                val result = productRepository.fetchProducts()
                liveData.postValue(Result.Success(result))
            } catch (e: Exception){
                liveData.postValue(Result.Error(e))
            }
        }
        return liveData
    }
}