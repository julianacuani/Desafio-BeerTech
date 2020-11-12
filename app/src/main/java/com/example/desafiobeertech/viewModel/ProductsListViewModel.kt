package com.example.desafiobeertech.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.desafiobeertech.network.Product
import com.example.desafiobeertech.repository.ProductsListRepository


class ProductsListViewModel(private val repository: ProductsListRepository): ViewModel() {
    val  productsList: LiveData<List<Product>>
        get() = repository.productsList
}