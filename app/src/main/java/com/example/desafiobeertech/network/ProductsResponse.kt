package com.example.desafiobeertech.network

import com.squareup.moshi.Json

data class ProductsResponse (
    @Json(name = "")
    val productsList: List<Product>)