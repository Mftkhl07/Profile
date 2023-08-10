package com.example.profil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SekolahAdapter (private val list:ArrayList<SekolahData>):
    RecyclerView.Adapter<SekolahAdapter.SekolahViewHolder>(){

        class SekolahViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val nama = itemView.findViewById<TextView>(R.id.namaSekolah)
            val alamt = itemView.findViewById<TextView>(R.id.alamatSekolah)

            fun bind(get: SekolahData) {
                nama.text = get.nama
                alamt.text = get.alamat
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SekolahViewHolder {
        return SekolahViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_sekolah, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SekolahViewHolder, position: Int) {
        holder.bind(list[position])
    }

}