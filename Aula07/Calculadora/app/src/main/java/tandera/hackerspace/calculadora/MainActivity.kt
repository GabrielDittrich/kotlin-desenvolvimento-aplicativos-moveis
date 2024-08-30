package tandera.hackerspace.calculadora

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var txtInputNum1 : TextInputLayout
    private lateinit var txtNum1 : TextInputEditText

    private lateinit var txtInputNum2 : TextInputLayout
    private lateinit var txtNum2 : TextInputEditText

    private lateinit var btnSomar : Button
    private lateinit var btnMenos : Button
    private lateinit var btnDividir : Button
    private lateinit var btnVezes : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtInputNum1 = findViewById(R.id.num1)
        txtInputNum2 = findViewById(R.id.num2)

        txtNum1 = findViewById(R.id.num1)
        txtNum2 = findViewById(R.id.num2)



    }
}