package com.example.activity8navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.activity8navigation.ViewModel.SubList
import com.example.activity8navigation.ViewModel.SubjectViewHolder

class MainActivity : AppCompatActivity() {

    lateinit var sujbectList:SubList


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        sujbectList=SubList()
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SubjectViewHolder(sujbectList.list)

    }
}