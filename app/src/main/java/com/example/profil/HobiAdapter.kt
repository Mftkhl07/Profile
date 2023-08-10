package com.example.profil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HobiAdapter (private val list:ArrayList<HobiData>):
    RecyclerView.Adapter<HobiAdapter.HobiViewHolder>(){

    class HobiViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.namaHobi)
        private val desc = itemView.findViewById<TextView>(R.id.DeskripsiHobi)

        fun bind(get: HobiData) {
            nama.text = get.nama
            desc.text = get.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobiViewHolder {
        return HobiViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_hobi, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HobiViewHolder, position: Int) {
        holder.bind(list[position])
    }

}