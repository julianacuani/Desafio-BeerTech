package com.example.desafiobeertech.network

import com.squareup.moshi.Json

data class ProductsResponse (
    val productsList: List<Product>)