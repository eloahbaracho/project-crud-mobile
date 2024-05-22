package com.example.projeto_crud


import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity

data class CadastroItem(
    val id : Int = 0,
val nome : String = "",
val valor : Double = 0.0,
val marca : String = "",
val nomeVendedor : String = "",
val emailVendedor : String = "",
val telefoneVendedor : String = "")




