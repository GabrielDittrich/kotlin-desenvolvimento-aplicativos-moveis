package com.testando.android

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textInputReal: TextInputLayout
    private lateinit var txtReal: TextInputEditText

    private lateinit var textInputDolar: TextInputLayout
    private lateinit var txtDolar: TextInputEditText

    private lateinit var btnCalcular: Button
    private lateinit var btnDolar: Button
    private lateinit var btnConfig: Button

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_de_vida", ">> onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_de_vida", ">>> onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_de_vida", ">>>> onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_de_vida", ">> onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo_de_vida", "> onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo_de_vida", ">>> onRestart")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Ciclo_de_vida", "> onCreate")

        var usuario : String? = null //"Roberto"
        btnConfig = findViewById(R.id.btn_config)
        btnConfig.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            if(usuario != null){
                intent.putExtra("nome_usuario", usuario)
            }

            startActivity(intent)

        }

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textInputReal = findViewById(R.id.textInputReal)
        textInputDolar = findViewById(R.id.textInputDolar)

        txtReal = findViewById(R.id.txtReal)
        txtDolar = findViewById(R.id.txtDolar)

        txtReal.inputType = android.text.InputType.TYPE_CLASS_NUMBER or android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL
        txtDolar.inputType = android.text.InputType.TYPE_CLASS_NUMBER or android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL

        btnCalcular = findViewById(R.id.btnCalcular)
        btnCalcular.setOnClickListener {
            val valorReal = txtReal.text.toString().toFloatOrNull() ?: 0f
            val valorDolar = valorReal / 5.6
            txtDolar.setText("$valorDolar")
        }

        btnDolar = findViewById(R.id.btnDolar)
        btnDolar.setOnClickListener {
            val valorDolar = txtDolar.text.toString().toFloatOrNull() ?: 0f
            val valorReal = valorDolar * 5.6
            txtReal.setText("$valorReal")
        }
    }
}
