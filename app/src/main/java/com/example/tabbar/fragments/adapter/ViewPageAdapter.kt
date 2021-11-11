package com.example.tabbar.fragments.adapter

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import com.example.tabbar.fragments.FavoriteFragment
import com.example.tabbar.fragments.HomeFragment
import com.example.tabbar.fragments.SettingsFragment


class ViewPageAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                FavoriteFragment()
            }
            2 -> {
                SettingsFragment()
            }
            else -> {
                HomeFragment()
            }
        }
    }

}