package tandera.hackerspace.variastelas

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textInputNome : TextInputLayout
    private lateinit var txtNome : TextInputEditText

    private lateinit var  btn_cadastrar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textInputNome = findViewById(R.id.textInputNome)
        txtNome = findViewById(R.id.txtNome)

        btn_cadastrar = findViewById(R.id.btn_cadastro)
        btn_cadastrar.setOnClickListener {
            val nome = txtNome.text.toString()

            txtNome.setText("$nome")
        }
    }
}