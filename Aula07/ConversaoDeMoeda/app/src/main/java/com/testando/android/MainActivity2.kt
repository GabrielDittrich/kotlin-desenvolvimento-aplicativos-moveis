package com.testando.android

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    lateinit var  txtOla : TextView
    lateinit var  btn_voltar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn_voltar = findViewById(R.id.btn_voltar)
        txtOla = findViewById(R.id.txtOla)

        val  bundle = intent.extras

        if (bundle != null){
            val usuario = bundle.getInt("nome_usuario")
            txtOla.text = "Bem vindo $usuario"
        }else
            txtOla.text = "Favor digitar usuario"

        val usuario = bundle?.getString("nome_usuario") ?: "sem nome"

        txtOla.text = "Bem Vindo $usuario"

        btn_voltar.setOnClickListener {
            finish()
        }
    }
}