package com.example.provatecnica06_01.Model

import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class ProfileAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>(), Parcelable {

    private lateinit var items: List<ProfileAdapter>

    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ProfileAdapter> {
        override fun createFromParcel(parcel: Parcel): ProfileAdapter {
            return ProfileAdapter(parcel)
        }

        override fun newArray(size: Int): Array<ProfileAdapter?> {
            return arrayOfNulls(size)
        }
        override fun getItemCount(): Int {
            return items.size
        }
    }
}