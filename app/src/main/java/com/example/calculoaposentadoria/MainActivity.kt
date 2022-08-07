package com.example.calculoaposentadoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spnSexo: Spinner = findViewById(R.id.spn_sexo)
        val txtIdade: EditText  = findViewById(R.id.txt_idade)
        val btnCalcular: Button = findViewById(R.id.btn_calcular)
        val txtResultado: TextView = findViewById(R.id.txt_resultado)

    }
}