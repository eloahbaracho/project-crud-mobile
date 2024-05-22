package com.example.projeto_crud

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import java.io.IOException

class Formulario : AppCompatActivity() {
    var clientHttp = OkHttpClient()
    override fun onCreate(bundle: Bundle) {
        super.onCreate(bundle)
        setContentView(R.layout.layout_cadastroitem)
        val txtNome = findViewById<EditText>(R.id.nomeitem)
        val txtValor = findViewById<Double>(R.id.valoritem)
        val txtMarca = findViewById<EditText>(R.id.marcaitem)
        val txtEmailVend = findViewById<EditText>(R.id.emailVendedor)
        val txtNomeVend = findViewById<EditText>(R.id.nomeVendedor)
        val txtTelefoneVend = findViewById<EditText>(R.id.telefoneVendedor)
        val body = RequestBody.create(
            MediaType.parse("application/json"),
            """
                    {
                        "nome": "${txtNome.text}",
                        "valor": "${txtValor.Double}",
                        "marca": "${txtMarca.text}"
                        "emailVendedor": "${txtEmailVend.text}"
                        "NomeVendedor": "${txtNomeVend.text}"
                        "TelefoneVendedor": "${txtTelefoneVend.text}"
                    }
                """.trimIndent()
        )
        val request = Request.Builder()
            .post(body)
            .url("https://fatec-2024-1s-pdmi-default-rtdb.firebaseio.com/agenda.json")
            .build()
        val response = object : Callback {
            override fun onFailure(call: Call?, e: IOException?) {
                Log.e("Itens à venda", e?.message.toString())
            }
            override fun onResponse(call: Call?, response: Response?) {
                val body = response?.body()
                body?.charStream()?.buffered()?.lines()?.forEach {
                    Log.i("AGENDA-CONTATO", it.toString())
                }





        }
    }
}