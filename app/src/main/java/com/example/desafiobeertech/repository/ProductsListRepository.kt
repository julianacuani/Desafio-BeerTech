package com.example.desafiobeertech.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.desafiobeertech.network.Product
import com.example.desafiobeertech.network.ProductsApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ProductsListRepository() {
    //segurador de dados interno da classe
    private val productsListResponse = MutableLiveData<List<Product>>()

    //expoe os dados retornados pelo serviço
    val  productsList: LiveData<List<Product>>
        get() = productsListResponse

    init {
        getProductsList()
    }

    //requisição dos dados do coquitéis através do retrofit
    private fun getProductsList() {
        //executando tarefas foras da main thread
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val listResult = ProductsApi.retrofitService.getProducts().productsList
                productsListResponse.postValue(listResult)

            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    productsListResponse.postValue(listOf())
                }
            }
        }
    }

}