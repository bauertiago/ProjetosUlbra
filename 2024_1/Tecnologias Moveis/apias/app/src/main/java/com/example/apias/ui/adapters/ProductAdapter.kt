package com.example.apias.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.apias.data.Product
import com.example.apias.databinding.ProductsItemBinding

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    private lateinit var context: Context
    private lateinit var binding: ProductsItemBinding
    private var listProducts: List<Product> = emptyList()

    fun setUpProducts(products: List<Product>) {
        this.listProducts = products
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        binding = ProductsItemBinding.inflate(LayoutInflater.from(context),parent,false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listProducts.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listProducts[position])
        binding.executePendingBindings()
    }

    inner class ViewHolder(private val bindingHolder: ProductsItemBinding) :
            RecyclerView.ViewHolder(bindingHolder.root) {
                fun bind(product: Product){
                    bindingHolder.produto = product
                }
            }
}