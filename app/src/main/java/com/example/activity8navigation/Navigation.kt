package com.example.activity8navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.activity8navigation.Fragments.FragmentViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Navigation : AppCompatActivity() {

    val tabArray= arrayOf("Notes","Syllabus","Assignment","Announcement")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        val subject = intent.getStringExtra("subject")

        val tablayout = findViewById<TabLayout>(R.id.tabLayout)
        val pager = findViewById<ViewPager2>(R.id.viewPager)

        val myAdapter = FragmentViewPagerAdapter(
            supportFragmentManager, lifecycle,"$subject"
        )

        pager.adapter = myAdapter

        //connecting the viewpager to tablayout

        TabLayoutMediator(tablayout,pager){
                tab,position ->tab.text = tabArray[position]
        }.attach()


    }
}