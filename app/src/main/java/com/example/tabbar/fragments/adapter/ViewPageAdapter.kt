package com.example.tabbar.fragments.adapter

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tabbar.fragments.FavoriteFragment
import com.example.tabbar.fragments.HomeFragment
import com.example.tabbar.fragments.SettingsFragment


class ViewPageAdapter(activity: FragmentActivity, private val tabCount: Int) : FragmentStateAdapter(activity){

    override fun getItemCount(): Int = tabCount

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> FavoriteFragment()
            2 -> SettingsFragment()
            else -> HomeFragment()
        }
    }


}