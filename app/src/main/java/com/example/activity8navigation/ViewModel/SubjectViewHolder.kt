package com.example.activity8navigation.ViewModel

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.activity8navigation.Navigation
import com.example.activity8navigation.R

class SubjectViewHolder(private val subList: List<String>) :
    RecyclerView.Adapter<SubjectViewHolder.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val subjectTextView: TextView = itemView.findViewById(R.id.subject)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return subList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val sub = subList[position]
        holder.subjectTextView.text = sub
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Navigation::class.java)
            intent.putExtra("subject", sub)
            holder.itemView.context.startActivity(intent)
        }
    }

}