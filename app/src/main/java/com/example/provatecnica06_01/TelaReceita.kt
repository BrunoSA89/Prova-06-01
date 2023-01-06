package com.example.provatecnica06_01

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class TelaReceita : Fragment(R.layout.tela_receita) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonOk).setOnClickListener {
            findNavController().navigate(R.id.action_telaReceita_to_cadastroReceita)
        }
    }
}
