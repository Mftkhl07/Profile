package com.example.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjectActivity : AppCompatActivity() {

    lateinit var projectView: RecyclerView
    lateinit var projectAdapter: ProjectAdapter
    val list = ArrayList<ProjectData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        projectView = findViewById(R.id.rvProject)
        projectView.layoutManager = LinearLayoutManager( this)

        list.add(ProjectData("Project",
        "Teacher Profil App", "https://github.com/Mftkhl07/Teacher-Profil-App"))

        list.add(ProjectData("Tugas",
        "Jobsheet 28", "https://github.com/Mftkhl07/Jobsheet-28"))

        projectAdapter = ProjectAdapter(list)
        projectView.adapter = projectAdapter

    }
}