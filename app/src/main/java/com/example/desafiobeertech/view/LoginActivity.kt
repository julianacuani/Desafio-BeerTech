package com.example.desafiobeertech.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.desafiobeertech.R
import com.example.desafiobeertech.databinding.ActivityMainBinding
import com.example.desafiobeertech.repository.ProductsListRepository
import com.example.desafiobeertech.viewModel.ProductsListViewModel
import com.example.desafiobeertech.viewModel.ProductsListViewModelFactory

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_login)

        val buttonLog = findViewById<Button>(R.id.buttonLog)
        buttonLog.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}
