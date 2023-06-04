package com.example.calculadora_less

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_menu = findViewById<Button>(R.id.btn_menu)
        btn_menu.setOnClickListener {
            val menu = Intent(this, menu::class.java)
            startActivity(menu)
        }
    }
}