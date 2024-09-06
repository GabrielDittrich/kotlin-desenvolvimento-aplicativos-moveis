package tandera.hackerspace.variastelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
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

        val btnLivro1: ImageButton = findViewById(R.id.btnLivro1)
        val btnLivro2: ImageButton = findViewById(R.id.btnLivro2)
        val textView: TextView = findViewById(R.id.textView)
        val btnVoltar: Button = findViewById(R.id.btn_voltar)

        // Receber o dado extra do Intent
        val nome = intent.getStringExtra("NOME_USUARIO")
        // Verificar se o nome é nulo ou vazio e exibir a mensagem apropriada
        textView.text = if (nome.isNullOrEmpty()) {
            "Nenhum nome recebido"
        } else {
            "Bem-vindo, $nome!"
        }

        // Intent para MainActivity3
        val novaTela = Intent(this, MainActivity3::class.java)

        // Configurar eventos dos botões para abrir MainActivity3 com diferentes valores
        btnLivro1.setOnClickListener {
            novaTela.putExtra("nome_livro", "Nome livro 1")
            startActivity(novaTela) // Iniciar a nova Activity
        }

        btnLivro2.setOnClickListener {
            novaTela.putExtra("nome_livro", "Nome livro 2") // Valor diferente para o segundo botão
            startActivity(novaTela) // Iniciar a nova Activity
        }

        // Botão para voltar à Activity anterior
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
