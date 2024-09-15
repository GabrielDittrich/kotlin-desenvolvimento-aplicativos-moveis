package com.example.trabalhomobile

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txtTituloNome : TextView = findViewById(R.id.txtTituloNome)
        val btnLogout : Button = findViewById(R.id.btnLogout)


        val nome = intent.getStringExtra("NOME_USUARIO")

        txtTituloNome.text = if (nome.isNullOrEmpty()) {
            "Nenhum nome recebido"
        } else {
            "Bem-vindo, $nome!"
        }

        btnLogout.setOnClickListener {
            finish()
        }
    }
}