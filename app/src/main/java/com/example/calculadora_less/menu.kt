package com.example.calculadora_less

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val n1 = findViewById<EditText>(R.id.n1)
        val n2 = findViewById<EditText>(R.id.n2)
        val resul = findViewById<TextView>(R.id.txt_resul)
        val spinner= findViewById<Spinner>(R.id.spi)
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)


        val lista = arrayOf("sumar", "restar", "multiplicar", "dividir")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador1
        btn_calcular.setOnClickListener {
            when (spinner.selectedItem.toString()) {

                "sumar" -> resul.text =
                    "Resultado: ${n1.text.toString().toInt() + n2.text.toString().toInt()}"

                "restar" -> resul.text =
                    "Resultado: ${n1.text.toString().toInt() - n2.text.toString().toInt()}"

                "multiplicar" -> resul.text =
                    "Resultado: ${n1.text.toString().toInt() * n2.text.toString().toInt()}"

                "dividir" -> resul.text =
                    "Resultado: ${n1.text.toString().toDouble() / n2.text.toString().toDouble()}"

    }
}
    }
}
