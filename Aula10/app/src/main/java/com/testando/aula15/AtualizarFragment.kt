package com.testando.aula15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class AtualizarFragment : Fragment() {

    lateinit var btnVoltar : Button
    lateinit var btnAtualizar : Button
    lateinit var txtNomeLivro : TextInputEditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_atualizar, container, false)

        btnVoltar = view.findViewById(R.id.btnVoltar)
        btnAtualizar = view.findViewById(R.id.btnAt)
        txtNomeLivro = view.findViewById(R.id.InputLivro)

        val nome:String = arguments?.getString("nome") ?: "erro"
        txtNomeLivro.setText(getString(R.string.livro_nome, nome));


        fun voltar() {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentConteudo, ListFragment())
                .commit()
        }

        btnVoltar.setOnClickListener {
            voltar()
        }

        return view
    }


}