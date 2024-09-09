package tandera.hackerspace.variastelas

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    lateinit var txtTitulo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // Ajuste para o layout da janela
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Verifique se o ID txtTitulo existe no layout activity_main3.xml
        txtTitulo = findViewById(R.id.txtTitulo)

        // Receber os extras da Intent
        val bundle = intent.extras
        txtTitulo.text = bundle?.getString("nome_livro") ?: "erro"

    }

}
