package com.example.provatecnica06_01

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ListaReceita : Fragment (R.layout.lista_de_receita) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonListaBack).setOnClickListener {
            findNavController().navigate(R.id.action_listaReceita_to_cadastroReceita)
        }
    }
}