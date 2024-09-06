package tandera.hackerspace.variastelas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textView: TextView = findViewById(R.id.textView)

        val btnVoltar: Button = findViewById(R.id.btn_voltar)

        // Receber o dado extra do Intent
        val nome = intent.getStringExtra("NOME_USUARIO")
        textView.text = nome ?: "Nenhum nome recebido"

        btnVoltar.setOnClickListener{
            finish()
        }
    }
}
