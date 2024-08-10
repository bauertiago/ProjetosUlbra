package com.example.apias

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.apias.commons.Result
import com.example.apias.data.repositories.ProductRepository
import com.example.apias.databinding.ActivityMainBinding
import com.example.apias.ui.ProductsViewModel
import com.example.apias.ui.adapters.ProductAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val productsViewModel: ProductsViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ProductAdapter

    @Inject
    lateinit var repository: ProductRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configureRecycler()
        observer()
    }

    private fun configureRecycler(){
        adapter = ProductAdapter()
        val gridLayoutManager = GridLayoutManager(this, 2)
        binding.rcproducts.layoutManager = gridLayoutManager
        binding.rcproducts.adapter = adapter
    }

    private fun observer(){
        productsViewModel.fetchProducts().observe(this) { result ->
            when(result) {
                is Result.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                is Result.Success -> {
                    binding.progressBar.visibility = View.GONE
                    adapter.setUpProducts(result.data)
                }
                is Result.Error -> {
                    Log.i("Error", "erro")
                }
            }

        }
    }
}