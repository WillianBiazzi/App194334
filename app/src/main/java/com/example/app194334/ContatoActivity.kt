package com.example.app194334

import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.app194334.R

data class Contato(val email: String, val mensagem: String)

class ContatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val emailEditText = findViewById<EditText>(R.id.textContatoEmail)
        emailEditText.setText("willianbiazzideoliveira@gmail.com")
        emailEditText.isEnabled = false

        val button = findViewById<Button>(R.id.bt_contatoEnviar)
        val message = findViewById<EditText>(R.id.text_contatoMensagem)
        button.setOnClickListener {
            val mensagem = message.text.toString().trim()
            if (mensagem.isEmpty()) {
                Toast.makeText(this, "Antes de enviar, escreva uma mensagem!", Toast.LENGTH_LONG)
                    .show()
            } else {
                Toast.makeText(this, "Obrigado por contatar!", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }
}