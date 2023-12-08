package com.example.a07ex06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // cria o objeto RecyclerView
        var r = findViewById<RecyclerView>(R.id.rv)
        // define a classe atual como gerenciadora do layout
        r.layoutManager = LinearLayoutManager(this)
        // cria um vetor de strings
        var arr = arrayOf("Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins")
        // define o adaptador
        var adapter = CustomAdapter(arr)
        // vincula a lista RecyclerView ao adaptador definido na linha anterior
        r.adapter = adapter
    }
}