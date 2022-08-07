package com.example.calculoaposentadoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spnSexo: Spinner = findViewById(R.id.spn_sexo)
        val txtIdade: EditText  = findViewById(R.id.txt_idade)
        val btnCalcular: Button = findViewById(R.id.btn_calcular)
        val txtResultado: TextView = findViewById(R.id.txt_resultado)


        spnSexo.adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, listOf("masculino", "feminino"))

        btnCalcular.setOnClickListener{
            // //aqui vai o código que será executado quando houver um click do botão

            //Capturando o sexo selecionado
            val sexo =spnSexo.selectedItem as String
            // Capturando a idade digitada
            val idade = txtIdade.text.toString().toInt()

            var resultado = 0

            if (sexo == "masculino"){
                resultado = 65 - idade
            }else{
                resultado = 60 - idade
            }

            txtResultado.text = "Faltam $resultado anos para você se aposentar."
        }

    }
}