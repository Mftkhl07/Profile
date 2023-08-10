package com.example.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SekolahActivity : AppCompatActivity() {
    lateinit var SekolahView: RecyclerView
    lateinit var SekolahAdapter: SekolahAdapter
    val list = ArrayList<SekolahData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sekolah)

        SekolahView = findViewById(R.id.rvSekolah)
        SekolahView.layoutManager = LinearLayoutManager( this)

        list.add(SekolahData("SDN Surodadi 2", "Surodadi, kec. Sayung, kab. Demak"))
        list.add(SekolahData("SMP Islam Terpadu Al-ma'ruf", "Candisari, kec.Mranggen, kab. Demak"))
        list.add(SekolahData("SMKN 1 Sayung", "Jl. Raya Semarang Demak km.14 Onggorawe "))

        SekolahAdapter = SekolahAdapter(list)
        SekolahView.adapter = SekolahAdapter
    }
}