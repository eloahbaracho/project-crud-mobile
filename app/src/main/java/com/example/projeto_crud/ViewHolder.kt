package com.example.projeto_crud

import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view : View)  : RecyclerView.ViewHolder(view){
    lateinit var txtNome : TextView
    lateinit var txtValor : TextView
    lateinit var txtMarca : TextView
    init {
        txtNome = view.findViewById(R.id.txtRowNome)
        txtMarca = view.findViewById(R.id.txtRowMarca)
        txtValor = view.findViewById(R.id.txtRowValor)
    }
}