package com.example.apias.data.network.responses

import com.example.apias.data.Product
import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("nameImage")
    val nameImage: String
)

fun ProductResponse.convertToModel() = Product(
    name = this.name,
    price = this.price,
    description = this.description,
    nameImage = this.nameImage
)
