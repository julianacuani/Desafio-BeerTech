package com.example.desafiobeertech.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.desafiobeertech.R
import com.example.desafiobeertech.databinding.ActivityMainBinding
import com.example.desafiobeertech.repository.ProductsListRepository
import com.example.desafiobeertech.viewModel.ProductsListViewModel
import com.example.desafiobeertech.viewModel.ProductsListViewModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recycleView = binding.itemsRecycleView
        val adapter = ProductItemAdapter()
        recycleView.adapter = adapter

        val viewModelFactory = ProductsListViewModelFactory(ProductsListRepository())
        val viewModel = ViewModelProvider(this, viewModelFactory).get(ProductsListViewModel::class.java)

        val itemsList = viewModel.productsList
        itemsList.observe(this, Observer { items ->
            adapter.data = items
        })
    }
}