package com.testando.android

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class
MainActivity : AppCompatActivity() {

    // Criar variaveis dos botoes -- nome igual o id

    private lateinit var textInputReal : TextInputLayout
    private lateinit var txtReal : TextInputEditText

    private lateinit var textInputDolar : TextInputLayout
    private lateinit var txtDolar : TextInputEditText

    private lateinit var btnCalcular : Button

    private lateinit var btnDolar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Chamando os botoes

        textInputReal = findViewById(R.id.textInputReal)
        textInputDolar = findViewById(R.id.textInputDolar)

        txtReal = findViewById(R.id.txtReal)
        txtDolar = findViewById(R.id.txtDolar)

        btnCalcular = findViewById(R.id.btnCalcular)
        btnCalcular.setOnClickListener {

            var valorReal = txtReal.text.toString()
            var valorDolar = valorReal.toFloat() / 5.6

            txtDolar.setText("$valorDolar")
        }

        btnDolar = findViewById(R.id.btnDolar)
        btnDolar.setOnClickListener {

            var valorDolar = txtDolar.text.toString()
            var valorReal = valorDolar.toFloat() * 5.6

            txtReal.setText("$valorReal")
        }


    }
}