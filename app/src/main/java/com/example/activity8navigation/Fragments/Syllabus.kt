package com.example.activity8navigation.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.activity8navigation.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Syllabus.newInstance] factory method to
 * create an instance of this fragment.
 */
class Syllabus : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_syllabus, container, false)

        val subject = arguments?.getString("subject")
        val textView = rootView.findViewById<TextView>(R.id.textView)
        textView.text = subject

        return rootView
    }

    companion object {
        fun newInstance(subject: String): Syllabus {
            val fragment = Syllabus()
            val args = Bundle()
            args.putString("subject", subject)
            fragment.arguments = args
            return fragment
        }
    }
}