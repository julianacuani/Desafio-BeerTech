package com.example.desafiobeertech.network


import com.squareup.moshi.Json

data class Product (
   @Json(name = "produto")
   val name: String,
   @Json(name = "descricao")
   val description: String,
   @Json (name = "preco")
   val price: String,
   @Json(name = "desconto")
   val discount: Boolean,
   @Json(name = "imagem")
   val image: String
)