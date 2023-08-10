package com.example.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity_Hobi : AppCompatActivity() {

    lateinit var HobiView: RecyclerView
    lateinit var HobiAdapter: HobiAdapter
    val list = ArrayList<HobiData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobi)

        HobiView = findViewById(R.id.rvHobi)
        HobiView.layoutManager = LinearLayoutManager( this)

        list.add(HobiData("Musik", "Mendengarkan musik"))
        list.add(HobiData("Nyanyi", "Bernyanyi"))

        HobiAdapter = HobiAdapter(list)
        HobiView.adapter = HobiAdapter
    }
}
