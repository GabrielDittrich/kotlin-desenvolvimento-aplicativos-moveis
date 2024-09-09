package tandera.hackerspace.fragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import tandera.hackerspace.fragment.fragmento.BlankFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnFrag1 : Button
    private lateinit var btnFrag2 : Button
    private lateinit var btnFrag3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnFrag1 = findViewById(R.id.btn_frag1)
        btnFrag2 = findViewById(R.id.btn_frag2)
        btnFrag3 = findViewById(R.id.btn_frag3)
        val fragmentManager = supportFragmentManager.beginTransaction()

        fragmentManager.add(R.id.fragmentContainerView2,BlankFragment())

        fragmentManager.commit()
    }
}