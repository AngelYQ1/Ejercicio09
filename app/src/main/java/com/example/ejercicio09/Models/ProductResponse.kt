package com.example.ejercicio09.Models

import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("products")
    val products: List<ProductModel>
)
