package com.example.provatecnica06_01

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CadastroReceita : Fragment(R.layout.cadastro_receita) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonCadastro).setOnClickListener {
            findNavController().navigate(R.id.action_cadastroReceita_to_telaReceita)
        }
        view.findViewById<Button>(R.id.buttonLista).setOnClickListener {
            findNavController().navigate(R.id.action_cadastroReceita_to_listaReceita2)
        }
    }
}