package com.example.viewpager2_tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {

    private lateinit var adapter: ViewPager2_Adapter
    private lateinit var viewPager: ViewPager2
    private lateinit var tablayout: TabLayout
    private val tableNames: Array<String> = arrayOf(

        "Актеры",
        "Описание"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ViewPager2_Adapter(this)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = adapter

        tablayout = findViewById(R.id.Tablayout)

        TabLayoutMediator(tablayout, viewPager) {tab, position ->
            tab.text = tableNames[position]
        }.attach()
    }
}