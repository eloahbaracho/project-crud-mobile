package com.example.projeto_crud

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException

class Formulario : AppCompatActivity() {
    override fun onCreate(bundle: Bundle) {
        super.onCreate(bundle)
        setContentView(R.layout.layout_cadastroitem)
        val txtNome = findViewById<EditText>(R.id.nomeitem)
        val txtValor = findViewById<Double>(R.id.valoritem)
        val txtMarca = findViewById<EditText>(R.id.marcaitem)
        val txtEmailVend = findViewById<EditText>(R.id.emailVendedor)
        val txtNomeVend = findViewById<EditText>(R.id.nomeVendedor)
        val txtTelefoneVend = findViewById<EditText>(R.id.telefoneVendedor)
        val request = Request.Builder()
            .get()
            .url()
            .build()
        val response = object : Callback {
            override fun onFailure(call: Call?, e: IOException?)
        }
    }
}