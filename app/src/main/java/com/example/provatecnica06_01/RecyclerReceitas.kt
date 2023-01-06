package com.example.provatecnica06_01

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class RecyclerReceitas : Fragment(R.layout.recycler_receitas) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonRecyclerBack).setOnClickListener {
            findNavController().navigate(R.id.action_recyclerReceitas_to_cadastroReceita)
        }
    }
}