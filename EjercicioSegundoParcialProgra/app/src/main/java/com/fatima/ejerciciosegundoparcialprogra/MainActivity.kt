package com.fatima.ejerciciosegundoparcialprogra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv_Mostrar: TextView
    private lateinit var lv_mascotas: ListView

    private val Mascota = arrayOf("Pajaro", "Gato", "Leon", "Tigre")
    private val especie = arrayOf("Canario", "Felidae", "Panthera leo", "Pantera Tigris")
    private val color = arrayOf("Amarillo", "Gris", "Cafe", "Anaranjado con Negro")
    private val sexo = arrayOf("Masculino", "Macho", "Macho", "Hembra")
    private val peso = arrayOf("1kg", "5kg", "250kg", "258kg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_Mostrar = findViewById(R.id.tv_mostrar)
        lv_mascotas = findViewById(R.id.lv_mascotas)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, Mascota)
        lv_mascotas.adapter = adaptador

        lv_mascotas.setOnItemClickListener() { AdapterView, View, i, l->
            tv_Mostrar.setText("Mascota: ${lv_mascotas.getItemAtPosition(i)}"+" Especie " +especie[i]+" Color "+color[i]+" Sexo "+color[i]+" Sexo" +sexo[i]+ " Peso "+peso[i])
        }
    }
}