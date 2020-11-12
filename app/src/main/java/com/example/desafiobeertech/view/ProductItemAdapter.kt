package com.example.desafiobeertech.view

import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.desafiobeertech.network.Product
import com.example.desafiobeertech.R

class ProductItemAdapter: RecyclerView.Adapter<ProductItemAdapter.ProductItemViewHolder>(){
    var data = listOf<Product>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class ProductItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ProductName: TextView = itemView.findViewById(R.id.product_name)
        val ProductDescription: TextView = itemView.findViewById(R.id.product_description)
        val ProductPrice: TextView = itemView.findViewById(R.id.product_price)
        val list: ImageView = itemView.findViewById(R.id.product_image)

        fun bind(name: String, description: String, price: String, imageURL: String) {
            ProductName.text = name
            ProductDescription.text = description
            ProductPrice.text = price

            val imageView = list;
            Glide.with(itemView.context)
                .load(imageURL)
                .into(imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.list_products, parent, false)
        return ProductItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        val productToShow: Product = data.get(position)
        holder.bind(productToShow.name, productToShow.description, productToShow.price, productToShow.image)
    }
}
