package tandera.hackerspace.variastelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var txtNome: TextInputEditText // Testo que a pessoa digitou
    private lateinit var btnCadastrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNome = findViewById(R.id.textInputNome)
        btnCadastrar = findViewById(R.id.btn_cadastro)

        btnCadastrar.setOnClickListener {
            val nome = txtNome.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("NOME_USUARIO", if (nome.isEmpty()) null else nome)
            startActivity(intent)
        }
    }
}
