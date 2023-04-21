package com.example.activity8navigation.Fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentViewPagerAdapter (fragmentManager: FragmentManager, lifecycle: Lifecycle, private val subject: String):
    FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Notes.newInstance(subject)
            1 -> Syllabus.newInstance(subject)
            2 -> Assignment.newInstance(subject)
            3 -> Announcement.newInstance(subject)
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}
