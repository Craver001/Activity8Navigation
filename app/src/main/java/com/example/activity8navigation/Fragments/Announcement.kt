package com.example.activity8navigation.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.activity8navigation.R
class Announcement : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_announcement, container, false)

        val subject = arguments?.getString("subject")
        val textView = rootView.findViewById<TextView>(R.id.textView)
        textView.text = subject

        return rootView
    }

    companion object {
        fun newInstance(subject: String): Announcement {
            val fragment = Announcement()
            val args = Bundle()
            args.putString("subject", subject)
            fragment.arguments = args
            return fragment
        }
    }
}