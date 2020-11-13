package com.example.desafiobeertech.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.desafiobeertech.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonLog.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            if (formValidation()) {
                startActivity(intent)
            }
        }
    }

    private fun formValidation(): Boolean {
        if (userEmail.text.isEmpty()) {
            messageFocus(this, "Usuario não pode ser vazio", userEmail)
            return false
        } else if (userPassword.text.isEmpty()) {
            messageFocus(this, "O campo senha não pode ser vazio", userPassword)
            return false
        }
        return true
    }

     private fun messageFocus(context: Context, message: String, editText: EditText) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        editText.error = message
        editText.requestFocus()
    }

}
