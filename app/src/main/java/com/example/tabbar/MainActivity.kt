package com.example.tabbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tabbar.databinding.ActivityMainBinding
import com.example.tabbar.fragments.adapter.ViewPageAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var mActivityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

       setUpTabs()

    }

   private fun setUpTabs(){
       val adapter = ViewPageAdapter( this, mActivityMainBinding.tabLayout.tabCount)
        mActivityMainBinding.viewPager.adapter = adapter

        mActivityMainBinding.viewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int){
                mActivityMainBinding.tabLayout.selectTab(mActivityMainBinding.tabLayout.getTabAt(position))
            }
        })

       mActivityMainBinding.tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener
       {
           override fun onTabSelected(tab: TabLayout.Tab)
           {
               mActivityMainBinding.viewPager.currentItem = tab.position
           }

           override fun onTabUnselected(tab: TabLayout.Tab?) {
               TODO("Not yet implemented")
           }

           override fun onTabReselected(tab: TabLayout.Tab?) {
               TODO("Not yet implemented")
           }


       })

    }



}