package com.positivo.aula09.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.ListFragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText
import com.positivo.aula09.R
import com.positivo.aula09.data.Livro
import com.positivo.aula09.data.LivroViewModel


class AddFragment : Fragment() {

    // Banco
    lateinit var livroViewModel: LivroViewModel

    // Input Text
    lateinit var txtNomeLivro : TextInputEditText

    // Botoes
    lateinit var btnVoltar : Button
    lateinit var btnAdd : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        txtNomeLivro = view.findViewById(R.id.txtEditNomeLivro)
        livroViewModel = ViewModelProvider(this).get(LivroViewModel::class.java)

        btnAdd = view.findViewById(R.id.btnAdicionar)
        btnAdd.setOnClickListener {
            addLivro()
        }

        btnVoltar = view.findViewById(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentConteudo, Lista())
                .commit()
        }

        return view
    }
    fun addLivro(){
        // Pegar o texto
        val nome = txtNomeLivro.text.toString()

        // Criar um livro
        val novoLivro = Livro(0,nome,1999)

        // Adicionar no banco
        livroViewModel.addLivro(novoLivro)

        Toast.makeText(requireContext(),"Livro Adicionado", Toast.LENGTH_LONG).show()

        voltar()
    }

    fun  voltar(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentConteudo, ListFragment())
            .commit()
    }

}