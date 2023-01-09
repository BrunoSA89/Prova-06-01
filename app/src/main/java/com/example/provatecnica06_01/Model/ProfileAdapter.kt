package com.example.provatecnica06_01.Model

import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class ProfileAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items: List<Profile>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ProfileViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        
    }
}